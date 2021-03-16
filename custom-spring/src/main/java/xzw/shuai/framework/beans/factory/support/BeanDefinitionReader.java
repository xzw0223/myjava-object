package xzw.shuai.framework.beans.factory.support;

/**
 * @author DELL
 * 用于解析配置文件的,该接口只定义规范
 */
public interface BeanDefinitionReader {
    /**
     * 获取注册表
     *
     * @return 注册表
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 加载配置文件并注册到注册表中
     *
     * @param configLocation 配置文件位置
     * @throws Exception 异常
     */
    void loadBeanDefinition(String configLocation) throws Exception;
}
