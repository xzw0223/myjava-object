package com.xzw.shuai.patterns.type.structural.bridge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        OperatingSystem mac = new Mac(new AviFile());

        mac.play("小泽玛利亚");


    }
}
