package xzw.shuai.spring.factory.support;

import xzw.shuai.spring.definition.BeanDefinition;
import xzw.shuai.spring.registry.BeanDefinitionRegistry;
import xzw.shuai.spring.registry.support.DefaultSingletonBeanRegistry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author DELL
 * beanFactory中集成的工程
 */
public class DefaultListableBeanFactory  extends AbstractAutowiredCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();


    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public <T> List<T> getBeansByTypes(Class<?> clazzType) {




        return null;
    }

    @Override
    public List<String> getBeanNameByTypes(Class<?> clazzType) {
        return null;
    }
}
