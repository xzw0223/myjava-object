package com.xzw.shuai.patterns.type.structural.flyweight;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        BoxFactory.getInstance().getShape("I").display("red");
        BoxFactory.getInstance().getShape("O").display("blue");
        AbstractBox l = BoxFactory.getInstance().getShape("L");
        l.display("yellow");
        AbstractBox l1 = BoxFactory.getInstance().getShape("L");
        l1.display("green");


        System.out.println(l == l1);


    }
}
