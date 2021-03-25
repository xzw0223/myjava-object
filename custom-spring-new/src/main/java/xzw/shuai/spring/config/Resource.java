package xzw.shuai.spring.config;

import java.io.InputStream;

/**
 * @author DELL
 *   提供对资源的访问
 */
public interface Resource {
    /**
     * 获取输入流
     * @return 输入流
     */
    InputStream getResourceAsStream();
}
