package com.xzw.shuai.patterns.type.structural.decorator;


import java.io.*;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        // 点一份炒饭
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + " -- " + food.cost() + "元");
        System.out.println();
        System.out.println(" ------------------ ");
        System.out.println();

        // 在炒饭中加个鸡蛋
        food = new Egg(food);
        System.out.println(food.toString());

        System.out.println(food.getDesc() + " -- " + food.cost() + "元");

        System.out.println();
        System.out.println(" ------------------ ");
        System.out.println();
        // 在加一份鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " -- " + food.cost() + "元");
        System.out.println(food.toString());

        System.out.println();
        System.out.println(" ------------------ ");
        System.out.println();

        // 价格培根
        food = new Bacon(food);
        System.out.println(food.toString());

        System.out.println(food.getDesc() + " -- " + food.cost() + "元");


        /*
            炒饭 -- 10.0元
             ------------------
            com.xzw.shuai.patterns.type.structural.decorator.Egg@677327b6
            鸡蛋炒饭 -- 11.0元
             ------------------
            鸡蛋鸡蛋炒饭 -- 12.0元
            com.xzw.shuai.patterns.type.structural.decorator.Egg@14ae5a5
             ------------------
            com.xzw.shuai.patterns.type.structural.decorator.Bacon@7f31245a
            培根鸡蛋鸡蛋炒饭 -- 14.0元

            TODO 个人理解
                通过输出结果来看,装饰者相当于,对象之间的嵌套作用 - 可以理解成  创建a对象 在创建b对象, b对象需要a对象来装饰自己
                在创建c对象, c对象需要一个对象装饰自己,假如是b装饰a,
                那么他们的关系就是这样      a ,   b(a) ,  c(b)
                a 是独立的,  a装饰了b ,  b装饰了c
                即 a单独对象,  b中包含了a对象,  c包含了b对象,       c(b(a))  -- 这是最终的一个对象结构
                通过地址值可以看出每个food对象是不同的

         */


        try {
            InputStream in = new BufferedInputStream(new BufferedInputStream(new BufferedInputStream(new BufferedInputStream(new FileInputStream("")))));

            byte[] buf = new byte[1024];
            int read = in.read(buf);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
