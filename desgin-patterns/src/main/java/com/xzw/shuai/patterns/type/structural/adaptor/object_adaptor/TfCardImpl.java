package com.xzw.shuai.patterns.type.structural.adaptor.object_adaptor;

/**
 * @author DELL
 * 适配者类
 */
public class TfCardImpl implements TfCard {
    @Override
    public String readTf() {
        return "tf card  read  msg : hello word tf card!";
    }

    @Override
    public void writeTf(String msg) {
        System.out.println("tf card write data msg = " + msg);
    }
}
