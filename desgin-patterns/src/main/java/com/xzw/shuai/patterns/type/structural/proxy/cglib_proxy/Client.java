package com.xzw.shuai.patterns.type.structural.proxy.cglib_proxy;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {

        // 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();


        System.out.println(proxyObject);
        while (true){
            Thread.sleep(10000);
        }
    }
}
