package com.xzw.shuai.patterns.type.create.singleton.demo1;

import java.io.Serializable;

/**
 * @author DELL
 * 枚举实现单列 -- 属于饿汉式的
 */

public class Singleton implements Serializable {

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 对外提供静态方法获取该对象
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 当进行反序列化时,会调用该方法,将该方法的返回值直接返回,不然会new一个新的对象,防止了单列的破坏
     */
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}