package com.xzw.shuai.patterns.type.structural.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @author DELL
 * 获取对代理对象的工厂类
 */
public class ProxyFactory {
    /**
     * 声明目标对象
     */
    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        // 返回代理对象即可
       /*
    todo   ClassLoader loader  类加载器,用于加载代理类,可通过目标对象获取类加载器
    todo   Class<?>[] interfaces 代理类实现接口的字节码对象
    todo   InvocationHandler h  代理对象的调用处理程序
        */

        return (SellTickets) Proxy
                .newProxyInstance(
                        trainStation.getClass().getClassLoader(),
                        trainStation.getClass().getInterfaces(),
                        (proxy, method, args) -> {
                            /*Object proxy 代理对象 invoke方法基本不用
                            Method method 对接口中的方法进行封装的method对象
                            Object[] args 调用方法的实际参数  -- 如sell方法中传递了参数
                            返回值即方法的返回值 */
//                            System.out.println("invoke 执行了");
                            System.out.println("带入点收取一定服务费用 - jdk 动态代理");
                            System.out.println(method.getName());
                            return method.invoke(trainStation, args);
                        }
                );

    }

}
