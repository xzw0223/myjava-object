package com.xzw.shuai.patterns.type.behavior.template;

/**
 * @author DELL
 * 炒菜心
 */

public class ConcreteClassCaiXin extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是海天海鲜麻辣酱");
    }
}
