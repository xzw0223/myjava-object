package com.xzw.shuai.patterns.type.structural.adaptor.class_adaptor;

/**
 * @author DELL
 * 适配者类接口
 */
public interface TfCard {
    /**
     * 从tf卡读取数据
     *
     * @return data
     */
    String readTf();

    /**
     * 从tf卡写数据
     * @param msg 数据
     */
    void writeTf(String msg);
}
