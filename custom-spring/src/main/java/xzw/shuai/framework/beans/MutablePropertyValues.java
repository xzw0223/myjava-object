package xzw.shuai.framework.beans;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author DELL
 * 用户存储和管理多个propertyValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {
    /**
     * 定义list对象,用于存储propertyValue对象
     */
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    public MutablePropertyValues() {
        propertyValueList = new ArrayList<>();
    }

    /**
     * 判断是否有指定的name属性的对象
     */
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) == null;
    }

    /**
     * 添加propertyValue对象
     */
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        if (propertyValue == null) {
            throw new RuntimeException("传递的数据为空");
        }
        // 判断是否存在 如果重复进行覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue value = propertyValueList.get(i);
            if (value.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                // 覆盖后并返回
                return this;
            }
        }
        propertyValueList.add(propertyValue);
        return this;
    }

    /**
     * 判断集合是否为空
     */
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    /**
     * 根据name属性获取propertyValue对象
     */
    public PropertyValue getPropertyValue(String propertyName) {

        // TODO 可以使用for循环去做

        final PropertyValue[] propertyValue = {null};
        propertyValueList.forEach(value -> {
            if (value.getName().equals(propertyName)) {
                propertyValue[0] = value;
            }
        });
        return propertyValue[0];

    }

    /**
     * 获取所有的property对象,返回以数组的形式
     */
    public PropertyValue[] getPropertyValues() {
        // 将集合转换成数组返回
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 获取迭代器对象
     */
    @Override
    public Iterator<PropertyValue> iterator() {

        return propertyValueList.iterator();
    }
}
