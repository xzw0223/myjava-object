package xzw.shuai.mybatis.sqlsession;

import xzw.shuai.mybatis.config.Configuration;

/**
 * @author DELL
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSqlSession() {
        return new DefaultSqlSession(configuration);
    }
}
