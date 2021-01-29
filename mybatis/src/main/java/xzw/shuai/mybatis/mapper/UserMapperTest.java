package xzw.shuai.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import xzw.shuai.mybatis.pojo.User;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author DELL
 * mapper映射
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void init() {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("two/SqlMapConfig.xml");
        } catch (IOException e) {
            System.out.println("没成功过");
            e.printStackTrace();
        }

        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

    }

    @Test
    public void testFindUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user.toString());
        sqlSession.close();
    }

}
