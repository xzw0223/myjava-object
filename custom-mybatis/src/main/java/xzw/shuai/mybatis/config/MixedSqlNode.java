package xzw.shuai.mybatis.config;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
