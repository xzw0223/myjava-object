package com.xzw.shuai.patterns.type.structural.adaptor.object_adaptor;

/**
 * @author DELL
 * 计算机
 */
public class Computer {
    /**
     * 从sd卡读取数据
     */
    public String readSd(SdCard sdCard){
            if(sdCard ==null){
                throw new NullPointerException("sc card is not null");
            }
            return sdCard.readSd();
    }

}
