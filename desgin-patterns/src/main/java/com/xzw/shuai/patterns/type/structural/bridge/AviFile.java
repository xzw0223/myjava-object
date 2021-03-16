package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * avi格式 -- 具体的实现化角色
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi 视频 " + fileName);
    }
}
