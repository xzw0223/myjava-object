package com.xzw.shuai.patterns.type;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author DELL
 */
public class test {
    public static void main(String[] args) throws InterruptedException {

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10000000; i++) {
            map.put(i + "", i + "AA");
        }
        System.out.println("开始");

        keySetForGetKey(map);
        Thread.sleep(2000);
        keySetForGetKeyAndValue(map);
        Thread.sleep(2000);
        keySetIteratorGetKey(map);
        Thread.sleep(2000);
        keySetIteratorGetKeyAndValue(map);
        Thread.sleep(2000);
        entrySetIteratorGetKeyAndValue(map);
        Thread.sleep(2000);
        entrySetIteratorGetKey(map);
        Thread.sleep(2000);
        entrySetForGetKeyAndValue(map);
        Thread.sleep(2000);
        entrySetForGetKey(map);
        Thread.sleep(2000);
        keySetIteratorGetKeyAndValue(map);
        Thread.sleep(2000);
        keySetIteratorGetKey(map);

    }


    //只获取key
    public static void keySetForGetKey(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (String key : map.keySet()) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println("keySetForGetKey运行时间" + (endTime - startTime));
    }

    //获取key和value
    public static void keySetForGetKeyAndValue(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (String key : map.keySet()) {
            String value = map.get(key);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("keySetForGetKeyAndValue运行时间" + (endTime - startTime));
    }

    //只获取key
    public static void keySetIteratorGetKey(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("keySetIteratorGetKey运行时间" + (endTime - startTime));
    }

    //获取key和value
    public static void keySetIteratorGetKeyAndValue(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(iterator.next());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("keySetIteratorGetKeyAndValue运行时间" + (endTime - startTime));
    }


    //只获取key
    public static void entrySetForGetKey(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("entrySetForGetKey运行时间" + (endTime - startTime));
    }

    //获取key和value
    public static void entrySetForGetKeyAndValue(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("entrySetForGetKeyAndValue运行时间" + (endTime - startTime));
    }

    //只获取key
    public static void entrySetIteratorGetKey(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("entrySetIteratorGetKey运行时间" + (endTime - startTime));
    }

    //获取key和value
    public static void entrySetIteratorGetKeyAndValue(Map<String, String> map) {
        long startTime = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
            String value = iterator.next().getValue();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("entrySetIteratorGetKeyAndValue运行时间" + (endTime - startTime));
    }


}
