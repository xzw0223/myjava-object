package com.xzw.shuai.patterns.type.structural.flyweight;

/**
 * @author DELL
 * 抽象享元角色
 */
public abstract class AbstractBox {

    /**
     * 获取图形的方法
     *
     * @return 图形
     */
    public abstract String getShape();

    /**
     * 显示图形及颜色
     */
    public void display(String color) {
        System.out.println("方块形状 : " + getShape() + "  方块颜色 : " + color);
    }

}
