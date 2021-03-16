package com.xzw.shuai.patterns.type.structural.adaptor.class_adaptor;

/**
 * @author DELL
 * 目标接口
 */
public interface SdCard {
    /**
     * 读数据
     * @return 数据
     */
    String readSd();

    /**
     * 写数据
     * @param msg 数据
     */
    void writeSd(String msg);
}
