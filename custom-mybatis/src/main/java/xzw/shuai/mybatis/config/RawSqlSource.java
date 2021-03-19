package xzw.shuai.mybatis.config;

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
