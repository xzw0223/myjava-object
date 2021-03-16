package xzw.shuai.framework.beans.factory.xml;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import xzw.shuai.framework.beans.BeanDefinition;
import xzw.shuai.framework.beans.MutablePropertyValues;
import xzw.shuai.framework.beans.PropertyValue;
import xzw.shuai.framework.beans.factory.support.BeanDefinitionReader;
import xzw.shuai.framework.beans.factory.support.BeanDefinitionRegistry;
import xzw.shuai.framework.beans.factory.support.SimpleBeanDefinitionRegistry;

import java.io.InputStream;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author DELL
 * 针对xml的解析类
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    /**
     * 声明注册表对象
     */
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinition(String configLocation) throws Exception {
        // 使用dom4j进行xml配置文件的解析
        SAXReader reader = new SAXReader();
        // 获取类路径下的配置文件
        InputStream is = XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        // 根据document获取跟标签对象(beans)
        Element rootElement = document.getRootElement();
        /*
        TODO <beans xmlns="http://www.springframework.org/schema/beans"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
                 <bean id="userDao" class="xzw.shuai.dao.impl.UserDaoImpl"/>
                  <bean id="userService" class="xzw.shuai.service.impl.UserServiceImpl">
                    <property name="userDao" ref="userDao"/>
                 </bean>
            </beans>
         */
        // 获取根标签所有bean标签的uix
        List<Element> beanElement = rootElement.elements("bean");

        beanElement.forEach(element -> {
            //  获取id属性
            // 获取class属性
            // 分装属性到beanDefinition
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");

            // 创建beanDefinition
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);

            // 创建mutablePropertyValues对象
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();

            // 获取bean标签下所有的property对象
            List<Element> propertyValues = element.elements("property");
            propertyValues.forEach(propertyElement -> {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name,ref,value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            });

            beanDefinition.setPropertyValues(mutablePropertyValues);

            // 将beanDefinition对象注册到注册表中
            registry.registryBeanDefinition(id,beanDefinition);
        });


    }
}
