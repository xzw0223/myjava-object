package com.xzw.shuai.patterns.type.create.build.demo1;

/**
 * @author DELL
 * 指挥者类
 */
public class Director {
    /**
     * 声明build变量
     */
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组装自行车
     */
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }

}
