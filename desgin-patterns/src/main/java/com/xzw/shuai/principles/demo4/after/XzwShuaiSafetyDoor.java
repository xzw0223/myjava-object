package com.xzw.shuai.principles.demo4.after;

/**
 * @author DELL
 */
public class XzwShuaiSafetyDoor implements AntiTheft,WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("xs 防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("xs 防水");
    }
}
