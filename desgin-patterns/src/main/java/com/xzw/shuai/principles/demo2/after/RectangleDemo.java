package com.xzw.shuai.principles.demo2.after;

import com.xzw.shuai.principles.demo2.before.Square;

/**
 * @author DELL
 * test
 *
 */
public class RectangleDemo {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);

        resize(rectangle);
        printLengthAndWidth(rectangle);



    }



    public static void resize(Rectangle rectangle){

        // 如果宽比长小,进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}
