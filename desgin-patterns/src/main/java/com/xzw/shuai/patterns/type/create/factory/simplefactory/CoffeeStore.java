package com.xzw.shuai.patterns.type.create.factory.simplefactory;

/**
 * @author DELL
 * 咖啡店
 */
public class CoffeeStore {


    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory scf = new SimpleCoffeeFactory();
        Coffee coffee = scf.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
