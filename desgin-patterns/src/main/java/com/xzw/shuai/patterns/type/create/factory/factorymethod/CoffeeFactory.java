package com.xzw.shuai.patterns.type.create.factory.factorymethod;


/**
 * @author DELL
 * 抽象工厂
 */
public interface CoffeeFactory {
    /**
     * 创建咖啡对象
     * @return 咖啡对象
     */
    Coffee createCoffee();
}
