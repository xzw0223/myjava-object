package com.xzw.shuai.patterns.type.create.factory.factorymethod;

import com.xzw.shuai.patterns.type.create.factory.abstractfactory.Coffee;
import com.xzw.shuai.patterns.type.create.factory.abstractfactory.Dessert;

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
