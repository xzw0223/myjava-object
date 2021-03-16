package com.xzw.shuai.patterns.type.create.singleton.hungry;

/**
 * @author DELL
 * 单列  饿汉式 - 静态成员变量的方式
 */
public class Singleton1 {

    /**
     * 在本类中构造 this 对象
     */
    private static Singleton1 singleton1 = new Singleton1();

    /**
     * 私有构造方法
     */
    private Singleton1() {
    }

    /**
     * 提供外部访问方式
     */
    public static Singleton1 getInstance() {
        return singleton1;
    }

}
