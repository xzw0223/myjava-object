package xzw.shuai.framework.context.support;

import xzw.shuai.framework.beans.BeanDefinition;
import xzw.shuai.framework.beans.MutablePropertyValues;
import xzw.shuai.framework.beans.PropertyValue;
import xzw.shuai.framework.beans.factory.support.BeanDefinitionRegistry;
import xzw.shuai.framework.beans.factory.xml.XmlBeanDefinitionReader;
import xzw.shuai.framework.utils.StringUtils;

import java.lang.reflect.Method;

/**
 * @author DELL
 * ioc 容器具体的子类
 * 用于加载类路径下的xml格式的配置文件
 */
public class ClassPtahXmlApplicationContext extends AbstractApplicationContext {
    public ClassPtahXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;

        // 构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            //调用refresh方法
            this.refresh();
        } catch (Exception e) {
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        // 判断容器是否包含指定对象,如果包含直接返回,否则自行创建

        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }

        // 获取beanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);

        // 获取bean信息中的className
        String className = beanDefinition.getClassName();

        // 通过反射撞见对象
        Class<?> clazz = Class.forName(className);
        Object beanObj = clazz.newInstance();

        // 进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            // 获取子标签属性
            String propertyName = propertyValue.getName();
            String value = propertyValue.getValue();
            String ref = propertyValue.getRef();
            if (ref != null && !"".equals(ref)) {
                // 获取依赖的bean对象
                Object bean = getBean(ref);
                // 拼接方法
                String methodName = StringUtils.getSetterMethodByFiledName(propertyName);

                // 拿到所有方法
                Method[] methods = clazz.getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(methodName)) {
                        // 执行该方法
                        method.invoke(beanObj, bean);
                    }
                }
            }
            if (value != null && !"".equals(value)) {
                String methodName = StringUtils.getSetterMethodByFiledName(propertyName);
                // 获取methods对象
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(beanObj, value);
            }

        }

        singletonObjects.put(name, beanObj);

        return beanObj;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean ==null){
            return null;
        }
        return clazz.cast(bean);
    }
}
