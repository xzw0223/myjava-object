package xzw.shuai.mybatis.sqlsession;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;
import xzw.shuai.mybatis.executor.CachingExecutor;
import xzw.shuai.mybatis.executor.Executor;
import xzw.shuai.mybatis.executor.SimpleExecutor;

import java.util.List;

/**
 * @author DELL
 */
public class DefaultSqlSession implements SqlSession {
    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T selectOne(String statementId, Object param) {
        List<Object> selectList = selectList(statementId, param);

        if (selectList == null || selectList.size() == 0) {
            return null;
        }

        if (selectList.size() == 1) {
            Object o = selectList.get(0);
            return (T) o;
        } else {
            throw new RuntimeException("玛德 出错了 艹");
        }

    }

    @Override
    public <T> List<T> selectList(String statementId, Object param) {
        // 根据statementId获取MappedStatement对象
        MappedStatement mappedStatement = configuration.getMappedStatementById(statementId);

        // 执行statement的操作有多种  --- >   1. 带有二级缓存的执行方式 2.基本执行方式(只带有1级缓存 :又分为多种,基本执行执行器,批处理执行器等..)

        // 此处可以考虑放到mappedStatement对象中,该对象中可以根据是否配置了二级缓存来确定创建的是哪个executor
        Executor executor = new CachingExecutor(new SimpleExecutor());
        return executor.query(mappedStatement, configuration, param);
    }
}
