package com.xzw.shuai.patterns.type.create.factory.abstractfactory;



/**
 * @author DELL
 * 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
