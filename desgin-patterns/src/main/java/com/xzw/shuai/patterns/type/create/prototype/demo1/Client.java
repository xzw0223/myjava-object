package com.xzw.shuai.patterns.type.create.prototype.demo1;

public class Client {
    public static void main(String[] args) throws Exception {

        // 创建源型类对象
        RealizeType realizeType = new RealizeType();
        realizeType.setName("123");

        // 调用克隆方法 获取新对象
        RealizeType clone = realizeType.clone();

        // 两个对象不是同一个对象
        System.out.println(realizeType);
        System.out.println(clone);
        System.out.println(clone == realizeType);
    }
}
