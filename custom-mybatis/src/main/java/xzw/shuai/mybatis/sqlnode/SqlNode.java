package xzw.shuai.mybatis.sqlnode;

import xzw.shuai.mybatis.sqlsource.DynamicContext;

/**
 * @author DELL
 * 提供对sql脚本的解析
 */
public interface SqlNode {


    void apply(DynamicContext context);
}
