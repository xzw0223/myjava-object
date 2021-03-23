package xzw.shuai.mybatis.sqlsession;

import java.util.List;

/**
 * @author DELL
 * 表示一个sql会话 ,  一次crud操作
 */
public interface SqlSession {
    /**
     *  单个查询
     * @param statementId   st id
     * @param param    param
     * @param <T>   t
     * @return  t
     */
    <T> T selectOne(String statementId,Object param);

    /**
     *  单个查询
     * @param statementId   st id
     * @param param    param
     * @param <T>   t
     * @return t
     */
    <T> List<T> selectList(String statementId, Object param);
}
