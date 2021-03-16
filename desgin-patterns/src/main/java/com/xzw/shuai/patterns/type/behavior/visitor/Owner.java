package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 * 具体访问者   自己
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("jack 喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("jack 喂狗");
    }
}
