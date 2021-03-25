package xzw.shuai.spring.aware;

import xzw.shuai.spring.factory.BeanFactory;

/**
 * @author DELL
 */
public interface BeanFactoryAware extends Aware {

    /**
     * 注入一个beanFactory的实例
     *
     * @param beanFactory beanFactory
     */
    void setBeanFactory(BeanFactory beanFactory);
}
