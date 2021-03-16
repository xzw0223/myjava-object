package com.xzw.shuai.patterns.type.behavior.interpreter;

import java.util.Objects;

/**
 * @author DELL
 * 变量类, 用于封装变量的
 */
public class Variable extends AbstractExpression {
    /**
     * 声明存储变量名的变量
     */
    private String name;

    public Variable(String name) {
        this.name = name;
    }
    int c ;
    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return  c =context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Variable variable = (Variable) o;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
