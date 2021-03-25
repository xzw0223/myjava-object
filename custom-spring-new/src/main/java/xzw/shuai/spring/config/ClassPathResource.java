package xzw.shuai.spring.config;

import java.io.InputStream;

/**
 * @author DELL
 */
public class ClassPathResource implements Resource {
    private String location;

    public ClassPathResource(String location) {
        this.location = location;
    }

    @Override
    public InputStream getResourceAsStream() {
        return this.getClass().getClassLoader().getResourceAsStream(location);
    }
}
