package com.xzw.shuai.patterns.type.structural.adaptor.class_adaptor;

/**
 * @author DELL
 * sd 适配  tf
 */
public class SdAdaptorTf extends TfCardImpl implements SdCard {
    @Override
    public String readSd() {
        System.out.println("current is adaptor read !");
        return readTf();
    }

    @Override
    public void writeSd(String msg) {
        System.out.println("current is adaptor write !");
        writeTf(msg);
    }

}
