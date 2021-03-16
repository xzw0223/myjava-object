package com.xzw.shuai.patterns.type.structural.adaptor.class_adaptor;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 读取sd 卡数据
        String s = computer.readSd(new SdCardImpl());

        System.out.println(s);
        System.out.println();
        System.out.println(" ---------------------------------- ");
        System.out.println();

        // 使用电脑读取tf卡数据

        // 定义适配器类
        SdAdaptorTf sdAdapTf = new SdAdaptorTf();
        String s1 = computer.readSd(sdAdapTf);
        System.out.println(s1);
    }
}
