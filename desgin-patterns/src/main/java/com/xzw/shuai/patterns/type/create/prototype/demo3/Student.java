package com.xzw.shuai.patterns.type.create.prototype.demo3;

import java.io.Serializable;

/**
 * @author DELL
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
