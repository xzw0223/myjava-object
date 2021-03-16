package com.xzw.shuai.patterns.type.behavior.visitor;

/**
 * @author DELL
 * 抽象元素角色
 */
public interface Animal {

    /**
     * 接收访问者功能
     *
     * @param person 人
     */
    void accept(Person person);

}
