package xzw.shuai.mybatis.sqlnode;

import xzw.shuai.mybatis.sqlnode.SqlNode;
import xzw.shuai.mybatis.sqlsource.DynamicContext;
import xzw.shuai.mybatis.utils.GenericTokenParser;
import xzw.shuai.mybatis.utils.OgnlUtils;
import xzw.shuai.mybatis.utils.SimpleTypeRegistry;
import xzw.shuai.mybatis.utils.TokenHandler;

/**
 * @author DELL
 */
public class TextSqlNode implements SqlNode {
    private String sqlText;

    public TextSqlNode(String sqlText) {
        this.sqlText = sqlText;
    }

    /**
     * 处理${}
     * before username like '%${username}'    -- >    username = 'zhangsan'
     * later  username like '%zhangsan'
     */
    @Override
    public void apply(DynamicContext context) {
        TokenHandler handler = new BindingTokenParser(context);
        GenericTokenParser genericTokenParser = new GenericTokenParser("${","}",handler);
        // 解析之后的sql 去除了${}
        String parseAsSqlStr = genericTokenParser.parse(sqlText);
        context.appendSql(parseAsSqlStr);
    }

    public boolean isDynamic() {
        return sqlText.contains("${");
    }
    private static class BindingTokenParser implements TokenHandler {
        private DynamicContext context;

        public BindingTokenParser(DynamicContext context) {
            this.context = context;
        }

        /**
         * expression：比如说${username}，那么expression就是username username也就是Ognl表达式
         */
        @Override
        public String handleToken(String expression) {
            Object paramObject = context.getBindings().get("_parameter");
            if (paramObject == null) {
                // context.getBindings().put("value", null);
                return "";
            } else if (SimpleTypeRegistry.isSimpleType(paramObject.getClass())) {
                // context.getBindings().put("value", paramObject);
                return String.valueOf(paramObject);
            }

            // 使用Ognl api去获取相应的值    todo 需要看ognl utils代码
            Object value = OgnlUtils.getValue(expression, context.getBindings());
            return value == null ? "" : String.valueOf(value);
        }

    }
}
