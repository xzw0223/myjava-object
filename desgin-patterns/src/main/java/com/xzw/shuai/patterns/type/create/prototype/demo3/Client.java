package com.xzw.shuai.patterns.type.create.prototype.demo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) throws Exception {
        deepClone();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        shallowClone();
    }

    /**
     * TODO 深克隆
     */
    public static void deepClone() throws Exception {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        // 创建 对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\DELL\\Desktop\\1231.txt"));
        // 写对象
        oos.writeObject(citation);
        oos.close();

        // 创建 对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\DELL\\Desktop\\1231.txt"));
        Citation o = (Citation) ois.readObject();
        ois.close();

        // 更改name 并输入
        o.getStudent().setName("李四");
        citation.show();
        o.show();

    }

    /**
     * TODO 浅克隆
     */
    public static void shallowClone() throws CloneNotSupportedException {
        // 获取原型对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");

        // 设置到类中
        citation.setStudent(student);

        // 克隆奖状对象
        Citation ct1 = citation.clone();
        // 设置克隆对象中student对象的name
        ct1.getStudent().setName("李四");

        System.out.println(citation.getStudent());
        System.out.println(ct1.getStudent());

        // 浅克隆情况下,他们调用引用类型引用类型对象地址值是通过一个 导致获取到的都是同一个对象
        citation.show();
        ct1.show();
    }
}
