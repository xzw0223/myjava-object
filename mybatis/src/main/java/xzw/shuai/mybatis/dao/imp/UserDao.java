package xzw.shuai.mybatis.dao.imp;

import xzw.shuai.mybatis.pojo.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询用户
     *
     * @param id 用户id
     * @return 用户
     * @throws Exception 异常
     */
    User findUserById(int id) throws Exception;

    /**
     * 查询用户列表
     *
     * @param name 用户名
     * @return 结果
     * @throws Exception 异常
     */
    List<User> findUserByName(String name) throws Exception;

    /**
     * 插入
     * @param user 用户
     * @throws Exception 
     */
    void insertUser(User user) throws Exception;
}
