package com.xzw.shuai.patterns.type.create.factory.factorymethod;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        AmericanCoffeeFactory acf = new AmericanCoffeeFactory();

        CoffeeStore coffeeStore = new CoffeeStore();

        coffeeStore.setCoffeeFactory(acf);


        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());


    }
}
