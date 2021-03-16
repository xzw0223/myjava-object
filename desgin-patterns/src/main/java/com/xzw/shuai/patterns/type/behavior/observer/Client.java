package com.xzw.shuai.patterns.type.behavior.observer;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        // 创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        // 订阅公众号
        subject.attach(new WeiXinUser("张三1"));
        subject.attach(new WeiXinUser("张三2"));
        subject.attach(new WeiXinUser("张三3"));
        subject.attach(new WeiXinUser("张三4"));
        subject.attach(new WeiXinUser("张三5"));
        subject.attach(new WeiXinUser("张三6"));

        // 通知观察者对象消息
        subject.notify("该吃屎呀!");


    }
}
