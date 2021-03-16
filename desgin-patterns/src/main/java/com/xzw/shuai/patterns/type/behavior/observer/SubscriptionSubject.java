package com.xzw.shuai.patterns.type.behavior.observer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author DELL
 * 具体主题角色
 */
public class SubscriptionSubject implements Subject {
    /**
     * 定义一个集合存储观察者对象
     */
    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // 便利观察者们 调用观察者对象中的update方法
        weiXinUserList.forEach(observer -> {
            observer.update(message);
        });
    }

}
