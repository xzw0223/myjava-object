package com.xzw.shuai.principles.demo3.before;

/**
 * @author DELL
 * 电脑
 */
public class Computer {

    private XiJieHardDisk hardDisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    public void run() {
        System.out.println("运行计算机");
        String s = hardDisk.get();
        System.out.println("从 disk 获取到数据的是 " + s);
        cpu.run();
        memory.save();

    }

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }
}
