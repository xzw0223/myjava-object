package xzw.shuai.mybatis.sqlsource;

import xzw.shuai.mybatis.sqlnode.SqlNode;

/**
 * @author DELL
 */
public class RawSqlSource implements SqlSource {

    private SqlSource sqlSource;

    public RawSqlSource(SqlNode rootSqlNode) {
        DynamicContext dynamicContext = new DynamicContext(null);
        // 先对sql节点进行解析
        SqlSourceParser sqlSourceParser = new SqlSourceParser();

        sqlSource = sqlSourceParser.parser(dynamicContext.getSql());
    }

    @Override
    public BoundSql getBoundSql(Object param) {
        // 从staticSqlSource中获取相应信息
        return sqlSource.getBoundSql(param);
    }
}
