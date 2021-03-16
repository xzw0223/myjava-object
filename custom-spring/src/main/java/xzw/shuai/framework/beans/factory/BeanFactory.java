package xzw.shuai.framework.beans.factory;

/**
 * @author DELL
 * ioc 容器父接口
 */
public interface BeanFactory {
    /**
     * 根据name获取bean
     *
     * @param name name
     * @return bean
     * @throws Exception 异常
     */
    Object getBean(String name) throws Exception;

    /**
     * 根据name和class获取bean
     *
     * @param name  name
     * @param clazz class
     * @param <T>   class类型
     * @return bean
     * @throws Exception 异常
     */
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;


}
