package com.xzw.shuai.patterns.type.create.factory.before;

/**
 * @author DELL
 */
public class Client {

    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        Coffee coffee = coffeeStore.orderCoffee("latte");

        System.out.println(coffee.getName());

    }
}
