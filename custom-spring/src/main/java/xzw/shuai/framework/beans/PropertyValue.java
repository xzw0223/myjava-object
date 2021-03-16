package xzw.shuai.framework.beans;

/**
 * @author DELL
 * 用来封装bean标签下的property标签的属性
 * name属性
 * ref属性
 * value属性     给基本数据类型及string类型赋的值
 */
public class PropertyValue {
    /**
     * name 属性
     */
    private String name;
    /**
     * ref属性
     */
    private String ref;
    /**
     * value属性
     */
    private String value;

    public PropertyValue() {
    }

    public PropertyValue(String name, String ref, String value) {
        this.name = name;
        this.ref = ref;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
