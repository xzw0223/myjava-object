package com.xzw.shuai.patterns.type;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author DELL
 * 装饰着
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("");

        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("hello word");

        bufferedWriter.close();
        writer.close();
    }
}
