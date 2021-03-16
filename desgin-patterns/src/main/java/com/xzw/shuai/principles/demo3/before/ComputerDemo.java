package com.xzw.shuai.principles.demo3.before;

/**
 * @author DELL
 */
public class ComputerDemo {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setHardDisk(new XiJieHardDisk());
        computer.setMemory(new KingstonMemory());


        // 执行
        computer.run();




    }
}
