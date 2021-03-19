package xzw.shuai.mybatis.config;

/**
 * @author DELL
 */
public class TextSqlNode implements SqlNode {
    private String sqlText;

    public TextSqlNode(String sqlText) {
        this.sqlText = sqlText;
    }

    @Override
    public void apply(DynamicContext context) {

    }

    public boolean isDynamic() {
        return sqlText.contains("${");
    }
}
