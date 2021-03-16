package xzw.shuai.framework.context;

import xzw.shuai.framework.beans.factory.BeanFactory;

/**
 * @author DELL
 * 定义延时加载功能
 */
public interface ApplicationContext  extends BeanFactory {

    /**
     * 嗯
     *
     * @throws Exception 嗯
     */
    void refresh() throws Exception;
}
