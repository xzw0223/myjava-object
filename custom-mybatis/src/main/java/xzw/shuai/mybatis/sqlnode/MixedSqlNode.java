package xzw.shuai.mybatis.sqlnode;

import xzw.shuai.mybatis.sqlnode.SqlNode;
import xzw.shuai.mybatis.sqlsource.DynamicContext;

import java.util.List;

/**
 * @author DELL
 */
public class MixedSqlNode implements SqlNode {
    private List<SqlNode> sqlNodes;

    public MixedSqlNode(List<SqlNode> sqlNodes) {
        this.sqlNodes = sqlNodes;
    }

    @Override
    public void apply(DynamicContext context) {
        sqlNodes.forEach(sqlNode -> sqlNode.apply(context));
    }
}
