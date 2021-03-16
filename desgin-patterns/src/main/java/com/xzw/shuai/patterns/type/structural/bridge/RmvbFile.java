package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * rmvb格式 -- 具体实现化角色
 */
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb 视频 " + fileName);
    }
}
