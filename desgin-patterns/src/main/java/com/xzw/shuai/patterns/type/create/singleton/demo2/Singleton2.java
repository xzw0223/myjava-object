package com.xzw.shuai.patterns.type.create.singleton.demo2;

/**
 * @author DELL
 * 枚举实现单列 -- 属于饿汉式的
 */

public class Singleton2 {

    private static volatile Singleton2 instance;

    private Singleton2() {
        // 反射破解单例模式需要添加的代码
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    /**
     * 对外提供静态方法获取该对象
     */
    public static Singleton2 getInstance() {

        if (instance != null) {
            return instance;
        }

        synchronized (Singleton2.class) {
            if (instance != null) {
                return instance;
            }
            instance = new Singleton2();
            return instance;
        }
    }
}