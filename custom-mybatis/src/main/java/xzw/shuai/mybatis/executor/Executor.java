package xzw.shuai.mybatis.executor;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;

import java.util.List;

/**
 * @author DELL
 */
public interface Executor {
    /**
     * 查询
     *
     * @param mappedStatement  获取sql语句和入参出参等信息
     * @param configuration   获取数据源
     * @param param           入参对象
     * @param <T>             T
     * @return T
     */
    <T> List<T> query(MappedStatement mappedStatement, Configuration configuration, Object param);
}
