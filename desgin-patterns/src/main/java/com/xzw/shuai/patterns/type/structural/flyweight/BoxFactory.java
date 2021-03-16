package com.xzw.shuai.patterns.type.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * 工厂类 -- 设计成单例模式
 */
public class BoxFactory {

    private static BoxFactory factory = new BoxFactory();
    private Map<String, AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();

        map.put("I", new IBox());
        map.put("O", new OBox());
        map.put("L", new LBox());
    }

    /**
     * 提供方法构建工厂
     */
    public static BoxFactory getInstance() {
        return factory;
    }

    /**
     * 根据名称获取图形对象
     */
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
