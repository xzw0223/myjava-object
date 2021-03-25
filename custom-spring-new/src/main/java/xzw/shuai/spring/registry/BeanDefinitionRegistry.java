package xzw.shuai.spring.registry;

import xzw.shuai.spring.definition.BeanDefinition;

/**
 * @author DELL
 * 对beanDefinition的管理和注册工作
 */
public interface BeanDefinitionRegistry {
    /**
     * 建立beanName和beanDefinition的映射关系
     *
     * @param beanName       beanname
     * @param beanDefinition beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 获取beanDefinition
     *
     * @param beanName beanName
     * @return definition
     */
    BeanDefinition getBeanDefinition(String beanName);

}
