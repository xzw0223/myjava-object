package com.xzw.shuai.patterns.type.structural.facade;

/**
 * @author DELL
 * 外观对象  --- 用于主要与该对象交互 --  todo 面子工程艹
 */
public class SmartAppliancesFacade {
    private Light light;
    private Tv tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new Tv();
        airCondition = new AirCondition();
    }

    /**
     * 通过语音控制
     */
    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的");
        }

    }

    private void on() {
        // 一键打开功能
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off() {
        // 一键关闭
        light.off();
        tv.off();
        airCondition.off();
    }

}
