package com.xzw.shuai.patterns.type.create.build.demo1;

/**
 * @author DELL
 * 具体的构建者 构建摩拜单车对象
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("mb 车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("mb 车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
