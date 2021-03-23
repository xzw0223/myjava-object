package xzw.shuai.mybatis.sqlsource;

import xzw.shuai.mybatis.sqlnode.MixedSqlNode;
import xzw.shuai.mybatis.sqlnode.SqlNode;

/**
 * @author DELL
 */
public class RawSqlSource implements SqlSource {
    private SqlNode rootSqlNode;

    public RawSqlSource(MixedSqlNode rootSqlNode) {
        this.rootSqlNode = rootSqlNode;
        // 先对sql节点进行解析

    }

    @Override
    public BoundSql getBoundSql(Object param) {
        return null;
    }
}
