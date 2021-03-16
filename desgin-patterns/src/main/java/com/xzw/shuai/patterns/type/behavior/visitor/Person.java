package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 * 抽象访问者角色
 */
public interface Person {
    /**
     * 喂食
     *
     * @param cat 猫
     */
    void feed(Cat cat);

    /**
     * 喂食
     *
     * @param dog 狗
     */
    void feed(Dog dog);
}
