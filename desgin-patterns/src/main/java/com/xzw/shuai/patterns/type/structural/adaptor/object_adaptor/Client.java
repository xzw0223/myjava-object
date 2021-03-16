package com.xzw.shuai.patterns.type.structural.adaptor.object_adaptor;

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


        String s1 = computer.readSd(new SdAdaptorTf(new TfCardImpl()));
        System.out.println(s1);
    }
}
