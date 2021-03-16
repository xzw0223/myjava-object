package com.xzw.shuai.principles.demo3.before;

/**
 * @author DELL
 * 希捷硬盘
 */
public class XiJieHardDisk {
    /**
     * 存储数据
     */
    public void save(String data){
        System.out.println("使用 xj 存储数据 = "  + data);
    }

    /**
     * 获取数据
     */
    public String get(){
        System.out.println("xj 获取数据");
        return "数据";
    }
}
