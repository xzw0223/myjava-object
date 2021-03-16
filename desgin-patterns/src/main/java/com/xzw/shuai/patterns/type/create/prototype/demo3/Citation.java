package com.xzw.shuai.patterns.type.create.prototype.demo3;


import java.io.Serializable;

/**
 * @author DELL
 * 嘉奖
 */
public class Citation implements Cloneable, Serializable {
    /**
     * 嘉奖人名
     */
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {

        return (Citation) super.clone();
    }

    public void show (){
        System.out.println(student.getName() +"同学获得嘉奖" );

    }
}
