package xzw.shuai.mybatis.config;

import org.dom4j.Element;
import org.dom4j.Node;

/**
 * @author DELL
 */
public class XMLStatementParser {
    private Configuration configuration;

    public XMLStatementParser(Configuration configuration) {
        this.configuration = configuration;
    }


    public void parseStatement(Element element, String namespace) {

        // 一个MappedStatement对象,就对应一个select 标签
        String id = element.attributeValue("id");
        // 参数类型     -- 传入的是全类名
        String parameterType = element.attributeValue("parameterType");
        // 结果类型
        String resultType = element.attributeValue("resultType");
        Class<?> parameterTypeClass = resolveClass(parameterType);
        Class<?> resultTypeClass = resolveClass(resultType);

        String statementType = element.attributeValue("statementType");
        statementType = statementType == null || "".equals(statementType) ? "prepared" : statementType;

        SqlSource sqlSource = createSqlSource(element);

        // sqlSource就是封装了sql语句,此时封装sql语句是没有进行处理的,
        // 那么什么时候处理呢 : 处理时机就是在sqlSession执行的时候,
        // select * from user where id =#{id}
        // String sqlText = selectElement.getTextTrim();
        // SqlSource sqlSource = new SqlSource(sqlText);

        String statementId = namespace + "." + id;
        // TODO 构建者模式改造     --  假设构造函数必须需要sqlSource  可能会有其他的 ,  其余参数根据实际情况来
        MappedStatement mappedStatement = new MappedStatement.Build(sqlSource)
                .setStatementId(statementId)
                .setStatementType(statementType)
                .setParameterTypeClass(parameterTypeClass)
                .setResultTypeClass(resultTypeClass)
                .build();

        configuration.setMappedStatement(statementId, mappedStatement);

    }

    /**
     * 创建sqlSource 其实就是对crud标签中sql进行处理
     */
    private SqlSource createSqlSource(Element element) {
        XMLScriptParser scriptParser = new XMLScriptParser(configuration);
        return scriptParser.parseScriptNode(element);
    }

    /**
     * 根据className 获取class对象
     */
    public Class<?> resolveClass(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("解析className出现异常" + "  className = " + className);

        }
    }

}
