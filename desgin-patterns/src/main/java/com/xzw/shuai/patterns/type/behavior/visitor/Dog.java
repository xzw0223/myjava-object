package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        // 访问者喂食 即宠物猫
        person.feed(this);
        System.out.println("大狗狗 吃骨头");
    }
}
