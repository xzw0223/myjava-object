package xzw.shuai.test;

import xzw.shuai.spring.config.ClassPathResource;
import xzw.shuai.spring.config.Resource;
import xzw.shuai.spring.factory.support.DefaultListableBeanFactory;
import xzw.shuai.spring.reader.XmlBeanDefinitionReader;

public class Test {
    public static void main(String[] args) {

        // 指定spring配置文件路径
        String location = "beans.xml";
        // 将路径封装成资源对象
        Resource resource = new ClassPathResource(location);
        // 创建BeanFactory对象
        DefaultListableBeanFactory beanDefinitionRegistry = new DefaultListableBeanFactory();
        // 加载spring配置文件 , 并最终将解析出来的beanDefinition注册到registry中
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        reader.loadBeanDefinitions(resource);

        // 从容器中获取指定beanName的对象
       Student student = (Student) beanDefinitionRegistry.getBean("student");
        System.out.println(student);
    }
}
