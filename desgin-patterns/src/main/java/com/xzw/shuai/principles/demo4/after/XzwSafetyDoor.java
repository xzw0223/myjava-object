package com.xzw.shuai.principles.demo4.after;

public class XzwSafetyDoor implements AntiTheft,FireProof,WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("xzw 防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("xzw 防火");
    }

    @Override
    public void waterProof() {
        System.out.println("xzw 防水");
    }
}
