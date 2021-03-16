package com.xzw.shuai.patterns.type.create.factory.abstractfactory;

/**
 * @author DELL
 * 美式风味 -- 生产美式咖啡 和 抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
