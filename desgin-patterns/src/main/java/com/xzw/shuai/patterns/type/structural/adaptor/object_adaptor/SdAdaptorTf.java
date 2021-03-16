package com.xzw.shuai.patterns.type.structural.adaptor.object_adaptor;

/**
 * @author DELL
 * sd 适配  tf
 */
public class SdAdaptorTf implements SdCard {
    /**
     * 声明适配者类
     */
    private TfCard tfCard;

    public SdAdaptorTf(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSd() {
        System.out.println("current is adaptor read !");
        return tfCard.readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("current is adaptor write !");
        tfCard.writeTf(msg);
    }

}
