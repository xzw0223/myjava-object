package xzw.shuai.framework.context.support;

import xzw.shuai.framework.beans.BeanDefinition;
import xzw.shuai.framework.beans.factory.support.BeanDefinitionReader;
import xzw.shuai.framework.beans.factory.support.BeanDefinitionRegistry;
import xzw.shuai.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * appContext接口的子实现类 , 用于立即加载
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    /**
     * 声明解析器变量,由子类创建
     */
    protected BeanDefinitionReader beanDefinitionReader;

    /**
     * 定义用于存储bean对象map的容器
     */
    protected Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 声明配置文件路径的变量
     */
    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        // 加载BeanDefinition对象
        beanDefinitionReader.loadBeanDefinition(configLocation);

        // 初始化bean
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        // 获取beanDefinition对象

        String[] beanNames = registry.getBeanDefinitionNames();
        // 进行bean的初始化
        for (String beanName : beanNames) {
            getBean(beanName);
        }

    }
}
