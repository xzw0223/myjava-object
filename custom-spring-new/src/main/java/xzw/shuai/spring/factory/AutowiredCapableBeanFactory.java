package xzw.shuai.spring.factory;

import xzw.shuai.spring.definition.BeanDefinition;

/**
 * @author DELL
 * 具有创建bean的功能,创建bean就需要对bean进行装配
 */
public interface AutowiredCapableBeanFactory extends BeanFactory {
    /**
     * 创建bean
     *
     * @param name
     * @param beanDefinition
     * @return bean
     */
    Object createBean(String name, BeanDefinition beanDefinition);
}
