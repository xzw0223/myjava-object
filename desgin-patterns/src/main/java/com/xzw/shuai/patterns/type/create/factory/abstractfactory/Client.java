package com.xzw.shuai.patterns.type.create.factory.abstractfactory;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        //  创建意大利风味甜品工厂
        ItalyDessertFactory factory = new ItalyDessertFactory();

        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();

        Coffee coffee = americanDessertFactory.createCoffee();
        Dessert dessert = americanDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
