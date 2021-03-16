package com.xzw.shuai.principles.demo2.before;

/**
 * @author DELL
 * test
 */
public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);

        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        Square square = new Square();
        square.setLength(10);
        // 违背里氏代换原则, 由于长和宽一直增长 无法输出
        resize(square);
        printLengthAndWidth(rectangle);
    }

    /**
     * 拓宽方法
     */
    public static void resize(Rectangle rectangle) {

        // 如果宽比长小,进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

    }
}
