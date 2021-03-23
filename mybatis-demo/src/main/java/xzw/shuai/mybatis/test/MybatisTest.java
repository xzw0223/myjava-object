package xzw.shuai.mybatis.test;

import org.dom4j.Document;
import org.junit.Test;
import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.utils.Resources;
import xzw.shuai.mybatis.config.XMLConfigParser;
import xzw.shuai.mybatis.utils.DocumentUtils;

import java.io.InputStream;

/**
 * @author DELL
 */
public class MybatisTest {

    @Test
    public void testInitConfiguration() {
        // 加载全局配置文件
        String source = "SqlMapConfig.xml";

        InputStream resourceAsStream = Resources.getResourceAsStream(source);

        // 获取Document对象
        Document document = DocumentUtils.readDocument(resourceAsStream);
        // 歇息document对象 获取configuration对象
        XMLConfigParser configParser = new XMLConfigParser();
        Configuration configuration = configParser.parse(document.getRootElement());

        System.out.println(configuration);
    }

}
