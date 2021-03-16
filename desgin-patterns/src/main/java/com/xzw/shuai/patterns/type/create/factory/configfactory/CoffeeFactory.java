package com.xzw.shuai.patterns.type.create.factory.configfactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author DELL
 * 咖啡工厂
 */
public class CoffeeFactory {


    /**
     * 加载配置文件,获取配置文件配置的全类名,并创建集合将对象全类名进行存储
     */
    private static Map<String, Coffee> coffees = new HashMap<>();

    static {


        Properties properties = new Properties();
//        InputStream resourceAsStream = CoffeeFactory.class
//                .getClassLoader()
//                .getResourceAsStream("target/classes/bean.properties");
        // 加载配置文件
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\object-git\\myjava-object\\desgin-patterns\\target\\classes\\bean.properties");
            properties.load(fileInputStream);
//            properties.load(resourceAsStream);
            // 获取所有全类名,并创建对象
            Set<Object> objects = properties.keySet();
            // 通过map的forEach来做循环
            objects.forEach(o -> {
                String key = o.toString();
                String className = properties.getProperty(key);
                try {
                    // 通过反射创建对象
                    Class<?> clazz = Class.forName(className);
                    Coffee instance = (Coffee) clazz.newInstance();
                    // 将对象和名称存储到容器中
                    coffees.put(key, instance);
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据名称获取对象
     */
    public static Coffee createCoffee(String name) {
        return coffees.get(name);
    }
}
