package xzw.shuai.spring.registry;

/**
 * @author DELL
 * 负责对单例bean的注册和管理工作
 */
public interface SingletonBeanRegistry {
    /**
     * 根据name获取实例
     * @param name
     */
 Object getSingleton(String name);

 void addSingleton(String name,Object bean);



 }