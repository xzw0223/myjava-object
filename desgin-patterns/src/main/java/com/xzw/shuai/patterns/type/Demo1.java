package com.xzw.shuai.patterns.type;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author DELL
 */
public class Demo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");
        //获取迭代器对象
        // 该方法是工厂模式
        Iterator<String> it = list.iterator();
        //使用迭代器遍历
        while(it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}