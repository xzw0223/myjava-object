package com.xzw.shuai.patterns.type.behavior.iterator;

import java.util.List;

/**
 * @author DELL
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    /**
     * 记录遍历时候的位置
     */
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的数据
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
