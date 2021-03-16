package com.xzw.shuai.patterns.type.create.factory.factorymethod;


/**
 * @author DELL
 * 咖啡店
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public CoffeeStore() {
    }

    /**
     * 给与set方法或者构造方法即可
     */


    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
