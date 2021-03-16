package com.xzw.shuai.patterns.type.create.factory.abstractfactory;

/**
 * @author DELL
 */
public interface DessertFactory {
    /**
     * 生产咖啡的功能
     */
    Coffee createCoffee();

    /**
     * 生产甜品的功能
     */
    Dessert createDessert();
}
