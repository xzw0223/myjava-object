package xzw.shuai.spring.registry.support;

import xzw.shuai.spring.registry.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * 单例bean的缓存管理
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String,Object> singletonBeans = new HashMap<>();
    @Override
    public Object getSingleton(String name) {
        return singletonBeans.get(name);
    }

    @Override
    public void addSingleton(String name, Object bean) {
        singletonBeans.put(name,bean);
    }
}
