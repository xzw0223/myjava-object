package com.xzw.shuai.patterns.type.structural.proxy.static_proxy;

/**
 * @author DELL
 * 静态代理案例
 */
public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();

        // 购买票
        proxyPoint.sell();
    }
}
