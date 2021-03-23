package xzw.shuai.mybatis.sqlsession;

import org.dom4j.Document;
import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.XMLConfigParser;
import xzw.shuai.mybatis.utils.DocumentUtils;

import java.io.InputStream;
import java.io.Reader;

/**
 * @author DELL
 * 构建sqlSessionFacotry 通过构建者模式
 */
public class SqlSessionFactoryBuild {
    public SqlSessionFactory build(InputStream inputStream) {
        Document document = DocumentUtils.readDocument(inputStream);
        XMLConfigParser xmlConfigParser = new XMLConfigParser();
        // 获取configuration对象
        Configuration configuration = xmlConfigParser.parse(document.getRootElement());
        return build(configuration);
    }

    private SqlSessionFactory build(Configuration configuration) {
        return new DefaultSqlSessionFactory(configuration);
    }

    /**
     * 自定义实现
     */
    public SqlSessionFactory build(Reader reader) {
        return null;
    }

}
