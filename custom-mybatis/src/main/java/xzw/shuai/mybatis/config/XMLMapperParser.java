package xzw.shuai.mybatis.config;

import org.dom4j.Element;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author DELL
 * 解析xml mapper
 */
public class XMLMapperParser {
    private Configuration configuration;

    public XMLMapperParser(Configuration configuration) {
        this.configuration = configuration;
    }

    /**
     * @param element 映射文件 UserMapper.xml --- 类似这种
     */
    public void parse(Element element) {
        String namespace = element.attributeValue("namespace");
        // 此处可以使用XPath语法来通配
        List<Element> select = element.elements("select");
        select.forEach(selectElement -> {
            // statement  == >  select  insert update delete  都对应一个statement
            XMLStatementParser statementParser = new XMLStatementParser(configuration);
            statementParser.parseStatement(selectElement,namespace);
        });


    }
}
