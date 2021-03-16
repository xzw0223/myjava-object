package xzw.shuai.framework.beans.factory.support;

import xzw.shuai.framework.beans.BeanDefinition;

/**
 * @author DELL
 * 注册表对象
 */
public interface BeanDefinitionRegistry {
    /**
     * 注册beanDefinition对象到注册表中
     *
     * @param beanName       name
     * @param beanDefinition bd
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);


    /**
     * 删除指定beanDefinition
     *
     * @param beanName name
     * @throws Exception 异常
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * 根据名称获取指定beanDefinition
     *
     * @param beanName name
     * @return bd
     * @throws Exception 异常
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    /**
     * 是否存在
     *
     * @param beanName name
     * @return result
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取bd数量
     *
     * @return 数量
     */
    int getBeanDefinitionCount();


    /**
     * 获取bd names
     *
     * @return names
     */
    String[] getBeanDefinitionNames();
}
