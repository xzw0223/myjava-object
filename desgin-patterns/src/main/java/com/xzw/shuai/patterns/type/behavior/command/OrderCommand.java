package com.xzw.shuai.patterns.type.behavior.command;

import java.util.Map;

/**
 * @author DELL
 * 具体命令类
 */
public class OrderCommand implements Command {
    /**
     * 持有接收者对象
     */
    private SeniorChef sc;

    /**
     * 持有订单对象
     */
    private Order order;

    public OrderCommand(SeniorChef sc, Order order) {
        this.sc = sc;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "卓的订单: ");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> entry : foodDir.entrySet()) {
            sc.makeFood(entry.getKey(), entry.getValue());
        }
        System.out.println(order.getDiningTable() + "桌的大虫子准备完毕~");
    }
}
