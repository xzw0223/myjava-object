package com.xzw.shuai.patterns.type.behavior.observer;

/**
 * @author DELL
 * 抽象主题觉角色
 */
public interface Subject {
    /**
     * 添加订阅者
     * @param observer  观察者
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer 观察者
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     * @param message  msg
     */
    void notify(String message);
}
