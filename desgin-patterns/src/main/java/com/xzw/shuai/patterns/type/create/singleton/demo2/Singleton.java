package com.xzw.shuai.patterns.type.create.singleton.demo2;

/**
 * @author DELL
 * 枚举实现单列 -- 属于饿汉式的
 */

public class Singleton {


    private static boolean flag = false;

    private Singleton() {

        // 添加同步代码块,防止出现多线程问题
        synchronized (Singleton.class) {
            // 判断 flag 是否为true,如果是true说明非第一次访问,直接抛出一个异常
            // 如果是false说明第一次创建,允许正常创建
            if (flag) {
                throw new RuntimeException("Cannot create multiple objects ----- 000 --");
            }

            // 将flag设置为true
            flag = true;
        }
    }

    /**
     * 对外提供静态方法获取该对象
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}