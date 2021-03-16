package com.xzw.shuai.patterns.type.create.singleton.hungry;

/**
 * @author DELL
 *  test
 */
public class Client {

    public static void main(String[] args) {
        // 创建单列对象
        Singleton1 instance = Singleton1.getInstance();

        Singleton1 instance1 = Singleton1.getInstance();

        // 判断对象是否是同一个对象
        System.out.println(instance == instance1);
        System.out.println(instance);
        System.out.println(instance1);

        // 类加载就会导致该单实例对象被创建
    }
}
