package xzw.shuai.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xzw.shuai.mybatis.dao.imp.UserDao;
import xzw.shuai.mybatis.pojo.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    /*
     * 1. sqlsession：方法级别
     * 2. sqlsessionFactory：全局范围（应用级别）
     * 3. sqlsessionFactoryBuilder：方法级别
     */

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }


    private static final Logger LOG = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public User findUserById(int id) {
        User user;

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            // 调用selectOne 返回一条数据
            // 参数1为 statement的id 参数2为sql传递的参数
            user = sqlSession.selectOne("test.findUserById", id);
            LOG.info("查询成功");
        }

        return user;

    }

    @Override
    public List<User> findUserByName(String name) {

        List<User> users;

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            users = sqlSession.selectList("test.findUsersByName", name);
            LOG.error("查询成功");
        }

        return users;
    }

    @Override
    public void insertUser(User user) {


        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            sqlSession.insert("test.insertUser", user);
            sqlSession.commit();
            LOG.warn("数据插入成功");
        }


    }
}
