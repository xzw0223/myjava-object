package xzw.shuai.mybatis.config;

import xzw.shuai.mybatis.sqlsource.SqlSource;

/**
 * @author DELL
 * 封装select inster 等 crud信息标签的信息
 */
public class MappedStatement {
    private String statementId;
    private Class<?> parameterTypeClass;
    private Class<?> resultTypeClass;
    private String statementType;
    private SqlSource sqlSource;

    private MappedStatement() {
    }

    public String getStatementId() {
        return statementId;
    }

    public Class<?> getParameterTypeClass() {
        return parameterTypeClass;
    }

    public Class<?> getResultTypeClass() {
        return resultTypeClass;
    }

    public String getStatementType() {
        return statementType;
    }

    public SqlSource getSqlSource() {
        return sqlSource;
    }

    public static final class Build {
        private MappedStatement mappedStatement = new MappedStatement();

        public Build(SqlSource sqlSource) {
            mappedStatement.sqlSource = sqlSource;
        }

        public Build setStatementId(String statementId) {
            this.mappedStatement.statementId = statementId;
            return this;
        }

        public Build setParameterTypeClass(Class<?> parameterTypeClass) {
            this.mappedStatement.parameterTypeClass = parameterTypeClass;
            return this;
        }

        public Build setResultTypeClass(Class<?> resultTypeClass) {
            this.mappedStatement.resultTypeClass = resultTypeClass;
            return this;
        }

        public Build setStatementType(String statementType) {
            this.mappedStatement.statementType = statementType;
            return this;
        }


        public MappedStatement build() {
            return mappedStatement;
        }
    }
}
