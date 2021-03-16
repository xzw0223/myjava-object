package com.xzw.shuai.patterns.type.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * 订单
 */
public class Order {

    /**
     * 订单餐桌号码
     */
    private int diningTable;
    /**
     * 做下的餐品和份数
     */

    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }


    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
