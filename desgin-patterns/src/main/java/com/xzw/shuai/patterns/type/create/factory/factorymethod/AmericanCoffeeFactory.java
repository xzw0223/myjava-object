package com.xzw.shuai.patterns.type.create.factory.factorymethod;

/**
 * @author DELL
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
