package com.xzw.shuai.patterns.type.behavior.iterator;

/**
 * @author DELL
 * 抽象聚合角色  接口
 */
public interface StudentAggregate {

    /**
     * 添加学生功能
     * @param student 学生
     */
    void addStudent(Student student);
    /**
     * 删除学生功能
     * @param student 学生
     */
    void removeStudent(Student student);
    /**
     * 获取迭代器功能
     * @return 迭代器
     */
    StudentIterator getStudentIterator();
}
