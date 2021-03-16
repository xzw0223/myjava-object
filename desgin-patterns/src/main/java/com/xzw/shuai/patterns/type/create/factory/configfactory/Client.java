package com.xzw.shuai.patterns.type.create.factory.configfactory;

/**
 * @author DELL
 *
 * 简单工厂 + 配置文件的方式
 */
public class Client {
    public static void main(String[] args) {

        Coffee american = CoffeeFactory.createCoffee("american");

        System.out.println(american.getName());

        System.out.println();
        System.out.println("-------------");
        System.out.println();


        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
