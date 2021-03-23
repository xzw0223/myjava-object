package xzw.shuai.mybatis.sqlsession;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;

import java.util.List;

/**
 * @author DELL
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration=configuration;
    }

    @Override
    public <T> T selectOne(String statementId, Object param) {
         // 根据statementId获取MappedStatement对象
        MappedStatement mappedStatement = configuration.getMappedStatementById(statementId);

        // 执行statement的操作有多种  --- >   1. 带有二级缓存的执行方式 2.基本执行方式(只带有1级缓存 :又分为多种,基本执行执行器,批处理执行器等..)


        return null;
    }

    @Override
    public <T> List<T> selectList(String statementId, Object param) {
        return null;
    }
}
