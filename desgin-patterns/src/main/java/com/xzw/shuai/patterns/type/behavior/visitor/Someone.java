package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 */
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("他人 喂猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("他人 喂狗");
    }
}
