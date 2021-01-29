package xzw.shuai.mybatis.mapper;

import xzw.shuai.mybatis.pojo.User;

/**
 * @author DELL
 */
public interface UserMapper {
    /**
     * 查询用户
     * @param id id
     * @return  user
     */
    User findUserById(int id) ;
}
