package com.xzw.shuai.patterns.type.behavior.command;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        // 创建订单对象
        Order o1 = new Order();
        o1.setDiningTable(1);
        o1.setFood("舍利子", 1);
        o1.setFood("童子尿", 2);


        Order o2 = new Order();
        o2.setDiningTable(2);
        o2.setFood("鲨鱼", 1);
        o2.setFood("鲨鱼血", 2);


        // 创建厨师对象
        SeniorChef seniorChef = new SeniorChef();

        // 创建命令对象
        OrderCommand oc1 = new OrderCommand(seniorChef, o1);
        OrderCommand oc2 = new OrderCommand(seniorChef, o2);

        // 创建调用者
        Waiter waiter = new Waiter();

        waiter.setCommand(oc1);
        waiter.setCommand(oc2);

        waiter.orderUp();
    }
}
