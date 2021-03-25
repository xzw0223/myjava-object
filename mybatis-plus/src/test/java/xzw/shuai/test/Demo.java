package xzw.shuai.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xzw.shuai.mapper.UserMapper;
import xzw.shuai.pojo.User;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelect(){

        // 此处为null 指的是不根据参数去查询
        List<User> users = userMapper.selectList(null);
        users.forEach( user -> System.out.println(user.getUsername()));


        // 根据id 删除
        userMapper.deleteById(11);

        // 添加数据

        User user = new User();
        user.setId(123L);
        user.setSex(2);
        user.setUsername("xzw");
        userMapper.insert(user);

        // 更新数据
        user.setUsername("qwe");
        userMapper.updateById(user);



    }

}
