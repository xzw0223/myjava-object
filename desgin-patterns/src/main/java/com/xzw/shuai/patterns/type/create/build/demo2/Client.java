package com.xzw.shuai.patterns.type.create.build.demo2;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        // 创建phone 对象

        Phone build = new Phone.Builder()
                .cpu("cpu")
                .mainboard("mb")
                .memory("me")
                .screen("sc")
                .build();
        System.out.println(build);
    }
}
