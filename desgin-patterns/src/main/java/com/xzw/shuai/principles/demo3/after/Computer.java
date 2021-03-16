package com.xzw.shuai.principles.demo3.after;

/**
 * @author DELL
 */
public class Computer {
    private HardDisk hd;
    private Cpu cpu;
    private Memory memory;
    public void run(){
        System.out.println("run computer");
        String data = hd.get();
        System.out.println("get data is : " + data);
        cpu.run();
        memory.save();
    }
    public HardDisk getHd() {
        return hd;
    }

    public void setHd(HardDisk hd) {
        this.hd = hd;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
