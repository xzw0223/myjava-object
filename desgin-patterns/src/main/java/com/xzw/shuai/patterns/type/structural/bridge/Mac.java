package com.xzw.shuai.patterns.type.structural.bridge;

/**
 * @author DELL
 * mac system  -- 扩展抽象化角色
 */
public class Mac extends OperatingSystem {
    public Mac(VideoFile vf) {
        super(vf);
    }

    @Override
    public void play(String fileName) {
        vf.decode(fileName);
    }
}
