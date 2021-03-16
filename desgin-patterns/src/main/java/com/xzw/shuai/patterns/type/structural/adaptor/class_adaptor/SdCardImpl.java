package com.xzw.shuai.patterns.type.structural.adaptor.class_adaptor;

/**
 * @author DELL
 * 目标接口具体的sd卡
 */
public class SdCardImpl implements SdCard {
    @Override
    public String readSd() {
        return "sd card read msg : hello word sd card";
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
