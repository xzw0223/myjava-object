package xzw.shuai.mybatis.sqlsession;


/**
 * @author DELL
 */
public interface SqlSessionFactory {
    /**
     * 获取sqlSession
     * @return sqlSession
     */
    SqlSession openSqlSession();
}
