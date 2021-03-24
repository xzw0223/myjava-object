package xzw.shuai.mybatis.sqlsource;

import xzw.shuai.mybatis.sqlnode.MixedSqlNode;
import xzw.shuai.mybatis.sqlnode.SqlNode;

/**
 * @author DELL
 */
public class DynamicSqlSource implements SqlSource {
    private SqlNode rootSqlNode;

    public DynamicSqlSource(MixedSqlNode rootSqlNode) {
        this.rootSqlNode = rootSqlNode;
    }

    /**
     * SQL session执行的时候才调用
     *
     * @param param
     * @return
     */
    @Override
    public BoundSql getBoundSql(Object param) {
        // 首先先调用sqlNode的处理,将动态标签和${}处理一下
        DynamicContext context =new DynamicContext(param);
        rootSqlNode.apply(context);

        // 再待用sqlSourceParser来处理#{}
        SqlSourceParser sqlSourceParser = new SqlSourceParser();
        SqlSource sqlSource = sqlSourceParser.parser(context.getSql());


        return sqlSource.getBoundSql(param);
    }
}
