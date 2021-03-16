package com.xzw.shuai.patterns.type.behavior.interpreter;

/**
 * @author DELL
 * 抽象表达式类
 */
public abstract class AbstractExpression {
    /**
     * 解释方法
     *
     * @param context 环境对象
     * @return 结果
     */
    public abstract int interpret(Context context);
}
