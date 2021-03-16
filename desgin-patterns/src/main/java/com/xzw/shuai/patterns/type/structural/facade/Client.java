package com.xzw.shuai.patterns.type.structural.facade;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();


        facade.say("打开电视");

        System.out.println("----");

        facade.say("关闭");
    }
}
