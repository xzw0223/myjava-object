package xzw.shuai.mybatis.sqlnode;

import xzw.shuai.mybatis.sqlsource.DynamicContext;

public class StaticTextSqlNode implements SqlNode {
    private String sqlText;

    public StaticTextSqlNode(String sqlText) {
        this.sqlText = sqlText;
    }

    @Override
    public void apply(DynamicContext context) {
        // sql 文本追加
        context.appendSql(sqlText);
    }
}
