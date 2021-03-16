package com.xzw.shuai.patterns.type.behavior.mediator;

/**
 * @author DELL
 * 抽象同事
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
