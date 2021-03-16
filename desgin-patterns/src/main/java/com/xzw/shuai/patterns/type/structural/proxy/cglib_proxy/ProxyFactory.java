package com.xzw.shuai.patterns.type.structural.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author DELL
 * 代理对象工厂 -- 获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 声明火车站对象
     */
    private TrainStation station = new TrainStation();

    /**
     * 获取代理对象
     */
    public TrainStation getProxyObject() {

        // 调用cglib包代码

        // 创建Enhancer对象, 类似于jdk代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);

        // 设置回调函数
        enhancer.setCallback(this);

        // 创建代理对象
        return (TrainStation) enhancer.create();


    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收点手续费 cglib");

        // 调用目标对象的方法

        return method.invoke(station, objects);
    }

}
