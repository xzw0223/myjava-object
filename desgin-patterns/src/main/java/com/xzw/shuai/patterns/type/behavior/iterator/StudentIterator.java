package com.xzw.shuai.patterns.type.behavior.iterator;

/**
 * @author DELL
 * 学生迭代器接口  抽象迭代器角色
 */
public interface StudentIterator{
    /**
     * 是否有下个元素
     * @return 是否有
     */
    boolean hasNext();

    /**
     * 下个元素
     * @return 学生
     */
    Student next();
}
