package com.xzw.shuai.patterns.type.behavior.template;

/**
 * @author DELL
 */
public class Client {


    public static void main(String[] args) {
        new ConcreteClassBaoCai().cookProcess();
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("");

        new ConcreteClassCaiXin().cookProcess();
    }
}
