package xzw.shuai.mybatis.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 * 封装解析成功sql的语句 和 解析出来的参数信息集合
 */
public class BoundSql {
    private String sql;

    private List<ParameterMapping> parameterMappings = new ArrayList<>();

    public BoundSql(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<ParameterMapping> getParameterMappings() {
        return parameterMappings;
    }

    public void addParameterMapping(ParameterMapping parameterMapping) {
       parameterMappings.add(parameterMapping);
    }
}
