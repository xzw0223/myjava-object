package xzw.shuai.dao.impl;

import xzw.shuai.dao.UserDao;

/**
 * @author DELL
 * 数据访问层实现
 */
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println(UserDaoImpl.class.getSimpleName() + "  被调用 ");
    }

    @Override
    public void add() {
        System.out.println("user dao ......");
    }
}
