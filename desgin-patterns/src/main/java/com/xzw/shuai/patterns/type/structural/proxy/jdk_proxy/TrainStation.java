package com.xzw.shuai.patterns.type.structural.proxy.jdk_proxy;

/**
 * @author DELL
 * 火车站卖票
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }

    @Override
    public void sell2() {
        System.out.println("火车站卖票2");
    }

    @Override
    public void sell23() {
        System.out.println("火车站卖票3");
    }
}
