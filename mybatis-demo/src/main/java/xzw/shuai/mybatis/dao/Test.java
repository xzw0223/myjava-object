package xzw.shuai.mybatis.dao;

import xzw.shuai.mybatis.pojo.User;
import xzw.shuai.mybatis.sqlsession.SqlSessionFactory;
import xzw.shuai.mybatis.sqlsession.SqlSessionFactoryBuild;
import xzw.shuai.mybatis.utils.Resources;

import java.io.InputStream;

/**
 * @author DELL
 */
public class Test {
    /**
     * 使用自定义的框架查询
     */
    @org.junit.Test
    public void testQueryUserById2() {

        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // sqlSessionFactory的创建有多种方式,但是不希望知道创建的构造细节
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuild().build(is);

        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        User user = new User();
        user.setId(1);
        User user1 = userDao.queryUserById2(user);
        System.out.println(user1.toString());
    }
}
