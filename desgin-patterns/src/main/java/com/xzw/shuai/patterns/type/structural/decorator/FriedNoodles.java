package com.xzw.shuai.patterns.type.structural.decorator;

/**
 * @author DELL
 * 炒面 具体构建角色
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
