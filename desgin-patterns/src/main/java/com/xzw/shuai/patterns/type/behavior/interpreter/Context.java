package com.xzw.shuai.patterns.type.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 */
public class Context {
    /**
     * 定义map存储变量及对应的值
     */
    private Map<Variable, Integer> map = new HashMap<>();

    /**
     * 添加变量的功能
     */
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    /**
     * 根据变量获取对应值的方法
     */
    public int getValue(Variable variable) {
        return map.get(variable);
    }

}
