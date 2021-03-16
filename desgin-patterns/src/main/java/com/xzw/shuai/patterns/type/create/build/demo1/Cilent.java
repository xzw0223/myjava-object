package com.xzw.shuai.patterns.type.create.build.demo1;

/**
 * @author DELL
 */
public class Cilent {
    public static void main(String[] args) {

        // 创建指挥者对象
        Director director = new Director(new OfoBuilder());

        // 指挥者装配自行车
        Bike construct = director.construct();


        System.out.println(construct.getFrame() + "  " + construct.getSeat());
    }
}
