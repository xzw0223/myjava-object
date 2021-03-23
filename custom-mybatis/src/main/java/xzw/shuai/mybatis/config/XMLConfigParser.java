package xzw.shuai.mybatis.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.dom4j.Document;
import org.dom4j.Element;
import xzw.shuai.mybatis.utils.DocumentUtils;
import xzw.shuai.mybatis.utils.Resources;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * 解析全局配置文件
 *
 * @author DELL
 */
public class XMLConfigParser {

    private Configuration configuration;

    public XMLConfigParser() {
        configuration = new Configuration();
    }

    public Configuration parse(Element element) {
        parseEnvironments(element.element("environments"));
        parseMappers(element.element("mappers"));
        return configuration;
    }

    /**
     * 解析mappers 标签
     */
    private void parseMappers(Element element) {
        List<Element> mappers = element.elements("mapper");
        mappers.forEach(this::parseMapper);
    }

    /**
     * 解析mapper标签
     */
    private void parseMapper(Element e) {
        String resource = e.attributeValue("resource");
        InputStream is = Resources.getResourceAsStream(resource);
        Document document = DocumentUtils.readDocument(is);
        //  按照 mapper标签语义 解析document
        XMLMapperParser mapperParser = new XMLMapperParser(configuration);
        mapperParser.parse(document.getRootElement());
    }

    /**
     * 解析环境变量标签
     */
    private void parseEnvironments(Element element) {
        String defEnvId = element.attributeValue("default");
        if (defEnvId == null || "".equals(defEnvId)) {
            return;
        }
        List<Element> elements = element.elements("environment");
        elements.forEach(envElement -> {
            String envId = envElement.attributeValue("id");
            // 判断defEnv id 和 env id是否一致,一致在继续解析
            if (defEnvId.equals(envId)) {
                parseEnvironment(envElement);
            }
        });
    }

    private void parseEnvironment(Element element) {
        Element dataSource = element.element("dataSource");
        String type = dataSource.attributeValue("type");
        type = type == null || "".equals(type) ? "DBCP" : type;
        if ("DBCP".equals(type)) {
            Properties properties = parseProperty(dataSource);
            BasicDataSource source = new BasicDataSource();
            source.setDriverClassName(properties.getProperty("driver"));
            source.setUrl(properties.getProperty("url"));
            source.setUsername(properties.getProperty("username"));
            source.setPassword(properties.getProperty("password"));
            configuration.setDataSource(source);
        }
    }

    private Properties parseProperty(Element element) {
        List<Element> property = element.elements("property");
        Properties prop = new Properties();
        for (Element e : property) {
            String name = e.attributeValue("name");
            String value = e.attributeValue("value");
            prop.put(name, value);
        }
        return prop;

    }
}
