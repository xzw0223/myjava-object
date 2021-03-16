package com.xzw.shuai.patterns.type.structural.proxy.static_proxy;

/**
 * @author DELL
 * 卖火车票代理点
 */
public class ProxyPoint implements SellTickets {
    /**
     * 声明火车站对象
     */
    private TrainStation trainStation = new TrainStation();


    @Override
    public void sell() {
        System.out.println("代理点收取费用");
        trainStation.sell();
    }
}
