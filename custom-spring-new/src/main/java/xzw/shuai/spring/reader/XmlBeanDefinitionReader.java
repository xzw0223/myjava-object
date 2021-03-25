package xzw.shuai.spring.reader;

import org.dom4j.Document;
import xzw.shuai.spring.config.Resource;
import xzw.shuai.spring.registry.BeanDefinitionRegistry;
import xzw.shuai.spring.utils.DocumentUtils;

import java.io.InputStream;

public class XmlBeanDefinitionReader {
    private BeanDefinitionRegistry beanDefinitionRegistry;

    public XmlBeanDefinitionReader(BeanDefinitionRegistry beanDefinitionRegistry) {
        this.beanDefinitionRegistry = beanDefinitionRegistry;
    }

    public void loadBeanDefinitions(Resource resource) {
        InputStream is = resource.getResourceAsStream();
        Document document = DocumentUtils.readDocument(is);
        XmlBeanDefinitionDocumentReader documentReader = new XmlBeanDefinitionDocumentReader(beanDefinitionRegistry);
        documentReader.loadBeanDefinitions(document.getRootElement());
    }
}
