package xzw.shuai.mybatis.config;

import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author DELL
 * 对crud标签进行处理
 */
public class XMLScriptParser {

    private Configuration configuration;
    private boolean isDynamic = false;
    private Map<String, NodeHandler> nodeHandlerMap = new HashMap<>();

    public XMLScriptParser(Configuration configuration) {
        this.configuration = configuration;

        initNodeHandlerMap();

    }

    private void initNodeHandlerMap() {
        nodeHandlerMap.put("if", new IfNodeHandler());
//        nodeHandlerMap.put("where", new WhereNodeHandler());
//        nodeHandlerMap.put("foreach", new ForeachNodeHandler());
    }

    public SqlSource parseScriptNode(Element element) {
        // 先将sql脚本按照不同的类型封装到不同的sqlNode中
        // 将sqlNode集合封装到sqlSource中
        // 由于带有#{}和${},动态标签的sql处理方式不同,所以需要不同的sqlSource中

        MixedSqlNode rootSqlNode = parseDynamicTags(element);
        //
        SqlSource sqlSource;
        if (isDynamic) {
            sqlSource = new DynamicSqlSource(rootSqlNode);
        } else {
            sqlSource = new RawSqlSource(rootSqlNode);
        }

        return sqlSource;
    }

    private MixedSqlNode parseDynamicTags(Element element) {
        List<SqlNode> contents = new ArrayList<>();
        int nodeCount = element.nodeCount();
        for (int i = 0; i < nodeCount; i++) {
            Node node = element.node(i);
            // 区分select 标签的子节点类型,

            // 如果类型是文本类型则封装StaticTextSqlNode
            if (node instanceof Text) {
                String sqlText = node.getText().trim();
                if ("".equals(sqlText)) {
                    continue;
                }
                TextSqlNode sqlNode = new TextSqlNode(sqlText);
                // 判断文本中是否包含${}
                if (sqlNode.isDynamic()) {
                    contents.add(sqlNode);
                    isDynamic = true;
                } else {
                    contents.add(new StaticTextSqlNode(sqlText));
                }

            } // 递归解析
            else if (node instanceof Element) {
                // 比如 if \ where \ foreach等动态sql子标签就在此处处理

                // 根据标签名称封装到不同的节点
                String nodeName = node.getName().toLowerCase();
                NodeHandler nodeHandler = nodeHandlerMap.get(nodeName);
                nodeHandler.handlerNode((Element) node, contents);
                isDynamic = true;
            }

        }
        return new MixedSqlNode(contents);
    }

    public class IfNodeHandler implements NodeHandler {


        @Override
        public void handlerNode(Element nodeToHandle, List<SqlNode> targetContents) {
            // 对标签进行解析
            MixedSqlNode mixedSqlNode = parseDynamicTags(nodeToHandle);

            String test = nodeToHandle.attributeValue("test");
            IfSqlNode ifSqlNode = new IfSqlNode(test, mixedSqlNode);
            targetContents.add(ifSqlNode);

        }
    }
}
