package com.xzw.shuai.patterns.type.structural.decorator;

/**
 * @author DELL
 * 培根  -- 具体装饰者角色
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }


    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
