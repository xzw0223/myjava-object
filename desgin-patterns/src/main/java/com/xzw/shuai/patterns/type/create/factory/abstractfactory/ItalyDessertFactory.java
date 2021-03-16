package com.xzw.shuai.patterns.type.create.factory.abstractfactory;


/**
 * @author DELL
 * 意大利风味    -- 生产 拿铁咖啡 - 提拉米苏
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
