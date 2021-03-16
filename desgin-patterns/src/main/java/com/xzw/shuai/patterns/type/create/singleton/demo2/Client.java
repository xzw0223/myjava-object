package com.xzw.shuai.patterns.type.create.singleton.demo2;

import java.lang.reflect.Constructor;

/**
 * @author DELL
 * 测试使用反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {

        // 获取字节码对象
        Class<Singleton> singletonClass = Singleton.class;

        // 获取默认的构造方法
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();

        // 取消访问检查
        constructor.setAccessible(true);

        // 创建singleton对象
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();

        // 返回false  说明破坏了单列模式
        System.out.println(singleton1 == singleton2);


    }

}
