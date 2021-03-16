package com.xzw.shuai.patterns.type.create.singleton.idler;

/**
 * @author DELL
 * 单列  懒汉式 --  线程安全式 -- 双重检查锁方式
 *
 * TODO 多线程情况下,可能会出现空指针,在多线程的情况下，可能会出现空指针问题，
 *  出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作
 */
public class Singleton2 {

    /**
     * 声明该类对象
     * volatile防止了空指针问题的出现
     *
     * TODO volatile 关键字可以保证可见性和有序性。
     */
    private static /*volatile*/ Singleton2 instance;

    private Singleton2() {

    }

    /**
     * 提供对外访问方式
     *
     */

    public static Singleton2 getInstance() {



        // 如果this对象为null 第一次创建,则创建对象;
        if(instance == null){

            // 添加同步代码块进行第二次判断
            synchronized (Singleton2.class){
                if(instance==null){
                    instance = new Singleton2();
                }
            }
        }



        return instance;
    }

}
