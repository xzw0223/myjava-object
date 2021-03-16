package com.xzw.shuai.patterns.type.create.singleton.idler;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        Singleton2 instance5 = Singleton2.getInstance();
        Singleton2 instance6 = Singleton2.getInstance();

        System.out.println(instance==instance1);
    }
}
