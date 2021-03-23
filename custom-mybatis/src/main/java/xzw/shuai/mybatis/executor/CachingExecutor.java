package xzw.shuai.mybatis.executor;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;

import java.util.List;

/**
 * @author DELL
 * 处理二级缓存的执行器
 */
public class CachingExecutor implements Executor {
    /**
     * 基本执行器
     */
    private Executor executor;

    public CachingExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override
    public <T> List<T> query(MappedStatement mappedStatement, Configuration configuration, Object param) {
        // TODO 伪代码
        // 1.从二级缓存根据sql语句获取结果       --- 思考 二级缓存如何存
        // 2.如果有直接返回,否则交给基本执行器去处理
        return executor.query(mappedStatement, configuration, param);
    }


}
