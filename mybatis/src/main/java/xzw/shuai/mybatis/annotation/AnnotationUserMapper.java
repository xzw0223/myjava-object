package xzw.shuai.mybatis.annotation;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import xzw.shuai.mybatis.pojo.User;

import java.util.List;

/**
 * @author DELL
 */
public interface AnnotationUserMapper {
    /**
     * 查询
     *
     * @param id id
     * @return 结果
     */
    @Select("select * from user where id = #{id}")
    User findUserById(int id);

    /**
     * 查询
     *
     * @param name name
     * @return 结果
     */
    @Select("select * from user where username like '%${value}%'")
    List<User> findUserList(String name);


    /**
     * 插入 并返回id
     *
     * @param user user
     */

    @SelectKey(statement = "select LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday}, #{sex}, #{address})")
    void insertUser(User user);
}
