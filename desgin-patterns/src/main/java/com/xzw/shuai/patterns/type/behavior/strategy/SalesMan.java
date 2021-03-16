package com.xzw.shuai.patterns.type.behavior.strategy;

/**
 * @author DELL
 * 促销员  -- 环境类
 */
public class SalesMan {

    /**
     * 策略类对象
     */
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 展示促销活动
     */
    public void salesManShow() {
        strategy.show();
    }

}
