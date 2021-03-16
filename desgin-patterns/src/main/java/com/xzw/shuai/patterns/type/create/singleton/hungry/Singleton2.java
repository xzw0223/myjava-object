package com.xzw.shuai.patterns.type.create.singleton.hungry;

/**
 * @author DELL
 * 单列 饿汉式 -- 静态代码块的方式
 */
public class Singleton2 {

    private Singleton2(){}

    /**
     * 声明this对象
     */
    private static Singleton2 instance ;
    static {
        // 在静态代码块中创建对象
        instance = new Singleton2();
    }

    public Singleton2 getInstance(){
        return instance;
    }

}
