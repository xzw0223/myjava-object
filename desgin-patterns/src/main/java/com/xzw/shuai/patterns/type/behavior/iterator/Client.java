package com.xzw.shuai.patterns.type.behavior.iterator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author DELL
 */
public class Client {
    public static void main(String[] args) {

        // 创建聚合对象
        StudentAggregateImpl aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("张三1", "one-1"));
        aggregate.addStudent(new Student("张三2", "one-2"));
        aggregate.addStudent(new Student("张三3", "one-3"));
        aggregate.addStudent(new Student("张三4", "one-4"));
        aggregate.addStudent(new Student("张三5", "one-5"));
        aggregate.addStudent(new Student("张三6", "one-6"));

        StudentIterator iterator = aggregate.getStudentIterator();


        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.toString());
        }

    }
}
