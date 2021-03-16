package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 * 具体元素角色 猫
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        // 访问者喂食 即宠物猫
        person.feed(this);
        System.out.println("大喵咪 吃🐟");
    }
}
