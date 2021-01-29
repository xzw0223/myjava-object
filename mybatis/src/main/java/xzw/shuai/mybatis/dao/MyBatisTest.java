package xzw.shuai.mybatis.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import xzw.shuai.mybatis.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

/**
 * @author DELL
 */
public class MyBatisTest {


    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("one/SqlMapConfig.xml");
        } catch (IOException e) {
            System.out.println("没成功过");
            e.printStackTrace();
        }

        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

    }


    @Test
    public void testFindUserById()  {
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        User userById = userDao.findUserById(2);
        String username = userById.getUsername();
        System.out.println(username);
        System.out.println(userById.toString());
    }


    @Test
    public void testFindUserByName(){
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        List<User> xzw = userDao.findUserByName("xzw");
        for (User user : xzw) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testInsertUser(){
        User user = new User("xxx1", new Date(System.currentTimeMillis()), "21", "3d");
        UserDaoImpl userDao = new UserDaoImpl(sqlSessionFactory);
        userDao.insertUser(user);
        System.out.println(user.toString());
    }
}
