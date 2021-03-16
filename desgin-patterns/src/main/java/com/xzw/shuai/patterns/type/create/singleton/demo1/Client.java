package com.xzw.shuai.patterns.type.create.singleton.demo1;

import java.io.*;

/**
 * @author DELL
 * 测试使用序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
//        writeObjectToFile();
        // 序列化后,破坏了单例性
        readObjectFromFile();
        readObjectFromFile();
    }


    /**
     * 从文件读取数据(对象)
     */
    public static void readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\DELL\\Desktop\\1231.txt"));

        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }
    /**
     * 向文件写数据(对象)
     */
    public static void writeObjectToFile() throws Exception {
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DELL\\Desktop\\1231.txt"));

        oos.writeObject(instance);

        oos.close();


    }
}
