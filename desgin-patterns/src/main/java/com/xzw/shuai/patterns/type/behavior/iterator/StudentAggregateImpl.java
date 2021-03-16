package com.xzw.shuai.patterns.type.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();


    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
