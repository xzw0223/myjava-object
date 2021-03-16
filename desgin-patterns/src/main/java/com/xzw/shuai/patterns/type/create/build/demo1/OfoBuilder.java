package com.xzw.shuai.patterns.type.create.build.demo1;

/**
 * @author DELL
 * ofo车构建者
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("ofo 车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo 车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
