package xzw.shuai.spring.factory.support;

import xzw.shuai.spring.definition.BeanDefinition;
import xzw.shuai.spring.factory.ListableBeanFactory;
import xzw.shuai.spring.registry.support.DefaultSingletonBeanRegistry;

/**
 * @author DELL
 * 符合抽象模板方法设计模式的一个类
 * 抽象模板方式 -- 两个角色 <父类和子类>
 * 父类指定统一的处理步骤
 * 子类负责特定步骤的细节实现
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ListableBeanFactory {


    @Override
    public Object getBean(String beanName) {

        // 获取缓存中的单例bean的实例
        // 如果有则返回,则获取指定的名称的BeanDefinition对象
        Object singleton = getSingleton(beanName);
        if (singleton != null) {
            return singleton;
        }
        // 通过BeanDefinition的scope信息,判断是单例还是多例,如果是单例则假入缓存
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        if (beanDefinition == null) {
            return null;
        }
        // 根据beanDefinition创建bean对象
        if (beanDefinition.isSingleton()) {
            singleton = createBean(beanName, beanDefinition);
            // 将创建出来的bean放入缓存 -- Map集合
            addSingleton(beanName, singleton);
            return singleton;
        } else if (beanDefinition.isPrototype()) {
            // 如果是多例bean 根据beanDefinition创建bean对象 并返回
            return createBean(beanName, beanDefinition);
        }

        return null;
    }

    /**
     * 创建bean
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    /**
     * 定义抽象方法 获取beanDefinition
     *
     * @param beanName bean name
     * @return bd
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName);


}
