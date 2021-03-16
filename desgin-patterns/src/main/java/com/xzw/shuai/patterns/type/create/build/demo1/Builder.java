package com.xzw.shuai.patterns.type.create.build.demo1;

/**
 * @author DELL
 * 构建者
 */
public abstract class Builder {
    /**
     * 声明bike类型变量,提高复用性
     */
    protected Bike bike = new Bike();

    /**
     * 构建车架
     */
    public abstract void buildFrame();

    /**
     * 构建车座
     */
    public abstract void buildSeat();

    /**
     * 构建自行车的方法
     */
    public abstract Bike createBike();
}
