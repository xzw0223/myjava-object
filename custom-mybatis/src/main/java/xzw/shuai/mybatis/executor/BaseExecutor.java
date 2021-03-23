package xzw.shuai.mybatis.executor;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author DELL
 * 基本执行器,主要处理一级缓存
 */
public abstract class BaseExecutor implements Executor {
    private Map<String, List<Object>> oneLevelCache = new HashMap<>();

    @SuppressWarnings("unchecked")
    @Override
    public <T> List<T> query(MappedStatement mappedStatement, Configuration configuration, Object param) {

        // 获取带有值的sql语句
        String sql = mappedStatement.getSqlSource().getBoundSql(param).getSql();

        // 从一级缓存中,根据sql语句获取查询结果
        List<Object> result = oneLevelCache.get(sql);
        if (result != null) {
            return (List<T>) result;
        }

        // 如果没有结果,则调用相应的处理器去处理
        result = queryFromDataBase(mappedStatement, configuration, param);
        return (List<T>) result;
    }

    /**
     * 使用了模板方法
     */
    public abstract List<Object> queryFromDataBase(MappedStatement mappedStatement, Configuration configuration, Object param) ;
}
