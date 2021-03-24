package xzw.shuai.mybatis.sqlsource;


import xzw.shuai.mybatis.utils.GenericTokenParser;
import xzw.shuai.mybatis.utils.ParameterMappingTokenHandler;

/**
 * @author DELL
 * 将dynamicSqlSource 和 RawSqlSource解析成staticSqlSource
 * staticSqlSource -- 存储的是解析后的sql  只有?的sql语句 以及相应的sql信息
 */
public class SqlSourceParser {
    public SqlSource parser(String sqlText) {

        ParameterMappingTokenHandler tokenHandler = new ParameterMappingTokenHandler();
        GenericTokenParser tokenParser = new GenericTokenParser("#{", "}", tokenHandler);
        // 处理之后 是不包含${}和#{}了的
        String sql = tokenParser.parse(sqlText);
        return new StaticSqlSource(sql, tokenHandler.getParameterMappings());
    }
}
