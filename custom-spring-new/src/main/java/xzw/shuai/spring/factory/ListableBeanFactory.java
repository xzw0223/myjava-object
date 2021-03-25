package xzw.shuai.spring.factory;

import java.util.List;

/**
 * @author DELL
 * 具有列表化功能的一个beanFactory,它可以以列表的形式展示容器中bean实例,或者其他
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 根据bean的类型,获取它以及子类型在容器中bean的实例
     *
     * @param clazzType
     * @param <T>
     * @return 获取所有子类对应的实例
     */
    <T> List<T> getBeansByTypes(Class<?> clazzType);

    /**
     * 根据bean的类型,获取它以及子类型在容器中bean的名称
     *
     * @param clazzType
     * @return 获取所有子类对应的名称
     */
    List<String> getBeanNameByTypes(Class<?> clazzType);
}
