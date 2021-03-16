package xzw.shuai.framework.beans.factory.support;

import xzw.shuai.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * 注册表接口的子实现
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry {

    /**
     * 定义一个容器,用于存储beanDefinition
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
