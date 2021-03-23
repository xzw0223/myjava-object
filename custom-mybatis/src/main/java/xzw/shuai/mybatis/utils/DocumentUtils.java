package xzw.shuai.mybatis.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.InputStream;

/**
 * @author DELL
 */
public class DocumentUtils {


    public static Document readDocument(InputStream inputStream) {
        SAXReader reader = new SAXReader();
        try {
            return reader.read(inputStream);
        } catch (DocumentException e) {
            e.printStackTrace();
            return null;
        }

    }

}
