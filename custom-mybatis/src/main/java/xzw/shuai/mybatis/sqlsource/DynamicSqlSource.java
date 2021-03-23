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
        return null;
    }
}
