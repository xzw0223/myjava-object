package xzw.shuai.mybatis.utils;

import java.io.InputStream;
import java.io.Reader;

/**
 * @author DELL
 * 获取source输入流
 */
public class Resources {

    public static InputStream getResourceAsStream(String source) {
        return Resources.class.getClassLoader().getResourceAsStream(source);
    }

    public Reader getResourceAsReader(String source) {
        return null;
    }
}
