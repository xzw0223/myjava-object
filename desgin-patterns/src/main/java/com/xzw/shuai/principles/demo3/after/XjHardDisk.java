package com.xzw.shuai.principles.demo3.after;

/**
 * @author DELL
 */
public class XjHardDisk implements HardDisk {
    @Override
    public void save() {
        System.out.println("use xj save data");
    }

    @Override
    public String get() {
        System.out.println("use xj get data ");
        return "data...";
    }
}
