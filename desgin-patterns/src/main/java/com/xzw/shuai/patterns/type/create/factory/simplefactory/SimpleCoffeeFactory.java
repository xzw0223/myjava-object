package com.xzw.shuai.patterns.type.create.factory.simplefactory;


/**
 * @author DELL
 * 简单的咖啡工厂
 */
public class SimpleCoffeeFactory {

    /**
     * 如果添加static 就变成了一个静态工厂
     */
    public /*static*/ Coffee createCoffee(String type){
        // 声明coffee类型,根据不同类型创建不同coffee对象
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("该咖啡么的");
        }
        return coffee;
    }

}
