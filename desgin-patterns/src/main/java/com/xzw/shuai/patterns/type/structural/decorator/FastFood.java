package com.xzw.shuai.patterns.type.structural.decorator;

/**
 * @author DELL
 * 快餐  -- 抽象组件
 */
public abstract class FastFood {
    /**
     * 价格
     */
    private float price;
    /**
     * 描述
     */
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }



    /**
     * 计算价格
     */
    public abstract float cost();
}
