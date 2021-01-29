package xzw.shuai.mybatis.annotation;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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
 * 注解方式开发
 */
public class AnnotationUserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        InputStream inputStream = null;
        try {
            final String resource = "three/SqlMapConfig.xml";
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            System.out.println("没成功过");
            e.printStackTrace();
        }

        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void testFindUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AnnotationUserMapper userMapper = sqlSession.getMapper(AnnotationUserMapper.class);

        User user = userMapper.findUserById(1);
        System.out.println(user.toString());


    }


    @Test
    public void testFindUserList() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AnnotationUserMapper userMapper = sqlSession.getMapper(AnnotationUserMapper.class);
        List<User> xzw = userMapper.findUserList("xzw");
        System.out.println(xzw);
    }


    @Test
    public void testInsertUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AnnotationUserMapper userMapper =
                sqlSession.getMapper(AnnotationUserMapper.class);
        User user = new User("xzw123", new Date(System.currentTimeMillis()), "d", "1");
        userMapper.insertUser(user);
        System.out.println(user.toString());
    }


}
