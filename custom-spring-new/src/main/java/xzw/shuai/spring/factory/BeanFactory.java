package xzw.shuai.spring.factory;

/**
 * @author DELL
 *
 *  基础容器的顶级接口,也是spring容器最重要的接口
 */
public interface BeanFactory {
    /**
     * 根据name 获取bean
     * @param beanName bean name
     * @return 实例
     */
    Object getBean(String beanName);



}
