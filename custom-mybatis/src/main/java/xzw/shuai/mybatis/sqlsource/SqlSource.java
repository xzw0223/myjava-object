package xzw.shuai.mybatis.sqlsource;

import xzw.shuai.mybatis.sqlsource.BoundSql;

/**
 * @author DELL
 * <p>
 * 一条完整的sql语句,对应一个sqlSource对象
 * 而sqlNode就是对一条完整sql语句中不同的部分进行的分装
 *
 * 主要是提供功能的封装 -- 获取解析之后的sql语句 -即jdbc可执行的语句
 */
public interface SqlSource {

    /**
     *
     * @param param
     * @return
     */
    BoundSql getBoundSql(Object param);
}
