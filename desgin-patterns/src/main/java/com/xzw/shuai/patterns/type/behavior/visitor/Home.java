package com.xzw.shuai.patterns.type.behavior.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author DELL
 * 对象结构类
 */
public class Home {
    /**
     * 生命集合存储元素对象
     */
    private List<Animal> nodeList = new ArrayList<>();

    /**
     * 添加元素功能
     */
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        //  遍历集合获取每一个元素 让访问者访问每一个对象
        nodeList.forEach(
                animal -> animal.accept(person)
        );

    }
}
