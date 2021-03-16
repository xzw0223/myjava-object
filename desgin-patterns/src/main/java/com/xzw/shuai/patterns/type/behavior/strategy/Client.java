package com.xzw.shuai.patterns.type.behavior.strategy;

import java.util.Arrays;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

            new SalesMan(new StrategyB())
                    .salesManShow();

            new SalesMan(new StrategyA())
                    .salesManShow();

            new SalesMan(new StrategyC())
                    .salesManShow();
    }
}
