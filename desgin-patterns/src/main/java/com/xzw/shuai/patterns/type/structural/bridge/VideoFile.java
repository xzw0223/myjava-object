package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * 视频文件 -- 实现化角色
 */
public interface VideoFile {
    /**
     * 解码
     *
     * @param fileName 文件名
     */
    void decode(String fileName);
}
