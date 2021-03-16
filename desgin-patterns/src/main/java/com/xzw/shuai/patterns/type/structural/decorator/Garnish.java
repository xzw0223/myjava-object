package com.xzw.shuai.patterns.type.structural.decorator;

/**
 * @author DELL
 * 装饰者 -- 抽象装饰者
 */
public abstract class Garnish extends FastFood {
    /**
     * 声明快餐类变量
     */
    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
