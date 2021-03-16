package com.xzw.shuai.patterns.type.create.factory.before;

/**
 * @author DELL
 * 咖啡店
 */
public class CoffeeStore {


    public Coffee orderCoffee(String type) {

        // 声明coffee类型,根据不同类型创建不同coffee对象
        Coffee coffee;

        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("该咖啡么的");
        }

        coffee.addMilk();
        coffee.addSugar();
        return coffee;


    }
}
