package com.xzw.shuai.patterns.type.create.singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author DELL
 */
public class RuntimeDemo {


    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        long l = runtime.freeMemory();

        Process exec = runtime.exec("ipconfig");

        InputStream inputStream = exec.getInputStream();

        byte[] bytes = new byte[1024 * 1024 * 100];

        // 读取数据
        int len = inputStream.read(bytes);

        // 将字节数组转换成字符串
        System.out.println(new String(bytes,0,len,"GBK"));
    }

}
