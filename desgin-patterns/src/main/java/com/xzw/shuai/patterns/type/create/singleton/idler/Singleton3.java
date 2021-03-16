package com.xzw.shuai.patterns.type.create.singleton.idler;

/**
 * @author DELL
 * 单列 - 懒汉 - 静态内部类方式
 */
public class Singleton3 {
    private Singleton3(){}


    /**
     * 定义静态内部类
     */
    private static class  SingletonHolder{
        // 在类中声明并初始化外部类对象
        private static final Singleton3 SINGLETON = new Singleton3();
    }

    public Singleton3 getInstance(){
        return SingletonHolder.SINGLETON;
    }
}
