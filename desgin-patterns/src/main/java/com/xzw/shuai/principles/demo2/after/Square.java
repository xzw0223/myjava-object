package com.xzw.shuai.principles.demo2.after;

/**
 * 正方形
 * @author DELL
 */
public class Square implements Quadrilateral {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
