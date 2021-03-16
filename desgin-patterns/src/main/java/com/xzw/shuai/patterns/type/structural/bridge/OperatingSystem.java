package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * 抽象的操作系统类,  --  抽象化角色
 */
public abstract class OperatingSystem {
    /**
     * 声明video 变量
     */
    protected VideoFile vf;

    public OperatingSystem(VideoFile vf) {
        this.vf = vf;
    }

    /**
     * 播放
     *
     * @param fileName 文件
     */
    public abstract void play(String fileName);

}
