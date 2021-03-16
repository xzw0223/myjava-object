package com.xzw.shuai.patterns.type.behavior.template;

/**
 * @author DELL
 * 炒包菜
 */

public class ConcreteClassBaoCai extends AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是海天海鲜酱油");
    }
}
