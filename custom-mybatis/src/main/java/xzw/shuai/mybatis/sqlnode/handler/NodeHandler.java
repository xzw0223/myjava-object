package xzw.shuai.mybatis.sqlnode.handler;

import org.dom4j.Element;
import xzw.shuai.mybatis.sqlnode.SqlNode;

import java.util.List;

/**
 * @author DELL
 * 针对不同子标签进行处理之后封装到对应的sqlNode当中
 * <p>
 * 如 if标签处理之后被封装到 ifSqlNode节点对象中
 */
public interface NodeHandler {
    /**
     * .
     *
     * @param nodeToHandle   待处理节点
     * @param targetContents 处理之后的节点集合
     */
    void handlerNode(Element nodeToHandle, List<SqlNode> targetContents);
}
