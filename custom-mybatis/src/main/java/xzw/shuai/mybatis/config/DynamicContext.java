package xzw.shuai.mybatis.config;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DELL
 * 存储sqlNode解析过程中产生的sql片段,并完成字符串的拼接,
 * 存储sqlNode解析过程中需要的入参信息
 */
public class DynamicContext {
    private StringBuilder sb = new StringBuilder();
    private Map<String, Object> bindings = new HashMap<>();

    public DynamicContext(Object param) {
        bindings.put("_parameter", param);
    }

    public void appendSql(String sql) {
        sb.append(sql);
        sb.append(" ");
    }

    public String getSql() {
        return sb.toString().trim();
    }

    public Map<String, Object> getBindings() {
        return bindings;
    }
}
