package com.xzw.shuai.patterns.type.behavior.observer;

import java.util.ArrayList;

/**
 * @author DELL
 * 具体的观察者角色类
 */
public class WeiXinUser implements Observer {
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(name + "-" + message);
    }


}
