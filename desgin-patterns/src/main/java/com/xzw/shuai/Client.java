package com.xzw.shuai;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
    private int number = 0;

    private void read() {
        System.out.println("number = "+ number);
    }

    private void write(int change) {
        number += change;
    }

    @Test
    public void test() throws InterruptedException {
        // 开启一个线程加 10000 次
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                write(1);
            }
            System.out.println("增加 10000 次已完成");
        }).start();

        // 开启一个线程减 10000 次
        new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                write(-1);
            }
            System.out.println("减少 10000 次已完成");
        }).start();

        // 睡眠一秒保证线程执行完成
        Thread.sleep(1000);
        // 读取结果
        read();
    }

    public static void main(String[] args) {


        ReentrantLock reentrantLock = new ReentrantLock();


        reentrantLock.lock();
        reentrantLock.unlock();
    }
}