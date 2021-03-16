package com.xzw.shuai.principles.demo3.after;

/**
 * @author DELL
 */
public class ComputerDemo {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setHd(new XjHardDisk());
        computer.setMemory(new KingstonMemory());


        computer.run();

    }
}
