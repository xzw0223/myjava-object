package com.xzw.shuai.patterns.type.structural.proxy.static_proxy;

/**
 * @author DELL
 * 火车站卖票
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
