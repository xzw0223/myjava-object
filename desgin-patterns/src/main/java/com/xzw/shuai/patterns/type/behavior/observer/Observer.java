package com.xzw.shuai.patterns.type.behavior.observer;

/**
 * @author DELL
 * 抽象观察者
 */
public interface Observer {
    /**
     *
     * @param message
     */
    void update(String message);
}
