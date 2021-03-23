package xzw.shuai.mybatis.sqlnode;

import xzw.shuai.mybatis.sqlsource.DynamicContext;
import xzw.shuai.mybatis.utils.OgnlUtils;

/**
 * @author DELL
 */
public class IfSqlNode implements SqlNode {
    private String test;
    private SqlNode rootSqlNode;

    public IfSqlNode(String test, MixedSqlNode rootSqlNode) {
        this.test = test;
        this.rootSqlNode = rootSqlNode;
    }

    @Override
    public void apply(DynamicContext context) {
        // 使用ognl的api对test标签属性中的布尔表达式进行处理
        boolean evaluateBoolean = OgnlUtils.evaluateBoolean(test, context.getBindings().get("_parameter"));
        // 如果test标签属性中的表达式判断为true 才进行子节点的处理
        if (evaluateBoolean) {
            rootSqlNode.apply(context);
        }

    }
}
