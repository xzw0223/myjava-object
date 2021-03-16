package com.xzw.shuai.patterns.type.structural.proxy.jdk_proxy;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 创建工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        // 调用方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell2();

        System.out.println(proxyObject.getClass());
        // 让程序一直运行
        while (true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
