package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * 扩展抽象化角色   -- windows system
 */
public class Windows extends OperatingSystem {
    public Windows(VideoFile vf) {
        super(vf);
    }

    @Override
    public void play(String fileName) {
        vf.decode(fileName);
    }
}
