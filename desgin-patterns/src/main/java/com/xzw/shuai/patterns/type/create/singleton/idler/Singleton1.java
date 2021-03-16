package com.xzw.shuai.patterns.type.create.singleton.idler;

/**
 * @author DELL
 * 单列  懒汉式 -- 线程不安全式 -- 线程安全式
 */
public class Singleton1 {

    /**
     * 声明该类对象
     */
    private static Singleton1 instance;

    private Singleton1() {

    }

    /**
     * 提供对外访问方式
     *
     * TODO 添加synchronized关键字后,会是安全的
     */

    public static /*synchronized */Singleton1 getInstance() {


        // TODO 当多线程的情况下,会出现多个对象

        // 如果this对象为null 第一次创建,则创建对象;
//        if(instance == null){
//            instance = new Singleton1();
//        }



        return instance == null ?
                instance = new Singleton1() : instance;
//        return instance;
    }

}
