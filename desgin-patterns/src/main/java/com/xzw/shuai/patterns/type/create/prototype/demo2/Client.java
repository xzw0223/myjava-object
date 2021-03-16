package com.xzw.shuai.patterns.type.create.prototype.demo2;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 获取原型对象
        Citation citation = new Citation();

        // 获取奖状对象
        Citation ct1 = citation.clone();
        ct1.setName("张三");
        Citation ct2 = citation.clone();
        ct2.setName("李四");
        Citation ct3 = citation.clone();
        ct3.setName("王五");
        Citation ct4 = citation.clone();
        ct4.setName("赵六");

        ct1.show();
        ct2.show();
        ct3.show();
        ct4.show();
    }
}
