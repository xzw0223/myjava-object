package xzw.shuai.service.impl;

import xzw.shuai.service.UserService;
import xzw.shuai.dao.UserDao;

/**
 * @author Dell
 * 业务逻辑层实现
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public UserServiceImpl() {
        System.out.println(UserService.class.getSimpleName() + " 被调用");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("user service .....");
        userDao.add();
    }
}
