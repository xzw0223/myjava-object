package xzw.shuai.dao.impl;

import xzw.shuai.dao.UserDao;

/**
 * @author DELL
 * 数据访问层实现
 */
public class UserDaoImpl implements UserDao {
    private String userName;
    private String password;
    public UserDaoImpl() {
        System.out.println(UserDaoImpl.class.getSimpleName() + "  被调用 ");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void add() {
        System.out.println("user dao ......" +  userName + " == " + password);
    }
}
