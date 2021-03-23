package xzw.shuai.mybatis.config;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 */
public class Configuration {

    private DataSource dataSource;
    private Map<String, MappedStatement> mappedStatements = new HashMap<>();

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setMappedStatement(String statementId, MappedStatement mappedStatement) {
        mappedStatements.put(statementId, mappedStatement);
    }

    public MappedStatement getMappedStatementById(String statementId) {
        return mappedStatements.get(statementId);
    }

}
