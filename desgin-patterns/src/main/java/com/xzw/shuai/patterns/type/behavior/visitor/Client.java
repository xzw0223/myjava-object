package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();

        home.add(new Dog());
        home.add(new Cat());



        home.action(new Owner());
    }
}
