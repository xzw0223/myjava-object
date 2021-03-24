package xzw.shuai.mybatis.executor;

import xzw.shuai.mybatis.config.Configuration;
import xzw.shuai.mybatis.config.MappedStatement;
import xzw.shuai.mybatis.sqlsource.BoundSql;
import xzw.shuai.mybatis.sqlsource.ParameterMapping;
import xzw.shuai.mybatis.sqlsource.SqlSource;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DELL
 */
public class SimpleExecutor extends BaseExecutor {


    @Override
    public List<Object> queryFromDataBase(MappedStatement mappedStatement, Configuration configuration, Object param) {

        try {

            // 获取连接 -- 获取sql -- 创建statement -- 设置参数 -- 执行statement -- 处理结果
            List<Object> result = new ArrayList<>();

            Connection connection = getConnection(configuration);

            BoundSql boundSql = getBoundSql(mappedStatement.getSqlSource(), param);

            String statementType = mappedStatement.getStatementType();
            // 使用mybatis的四大组件来优化
            if ("prepared".equals(statementType)) {
                PreparedStatement statement = createStatement(connection, boundSql.getSql());
                handleParameter(statement, param, boundSql);

                ResultSet resultSet = statement.executeQuery();
                handleResult(resultSet, mappedStatement, result);
            }
            return result;
        } catch (SQLException | IllegalAccessException | NoSuchFieldException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void handleResult(ResultSet resultSet, MappedStatement mappedStatement, List<Object> results) throws SQLException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        // 从结果集中一行一行获取数据
        // 每一行数据在一列有一列的取出来,
        // 最终将获取到的每一列的值都映射到目标对象指定的属性中 -- 列名和属性名要保持一致

        Class<?> resultTypeClass = mappedStatement.getResultTypeClass();
        while (resultSet.next()) {
            // 结果目标对象
            Object instance = resultTypeClass.newInstance();
            // 获取元数据( 目的取列的信息)
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                String columnName = metaData.getColumnName(i + 1);
                Field field = resultTypeClass.getDeclaredField(columnName);
                field.setAccessible(true);
                Object object = resultSet.getObject(columnName);

                field.set(instance, object);
            }


            results.add(instance);
        }
    }

    private void handleParameter(PreparedStatement statement, Object param, BoundSql boundSql) throws SQLException, NoSuchFieldException, IllegalAccessException {
        // 获取参数集合信息  -- #{}处理之后的参数信息

        // 判断入参类型,如果是简单类型则直接处理
        if (param instanceof Integer) {
            statement.setInt(1, (Integer) param);
        } else if (param instanceof String) {
            statement.setString(1, (String) param);
        } else {
            // 如果是引用类型,则根据参数信息里面的参数名称,获取入参对象对应的参数值
            List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
            for (int i = 0; i < parameterMappings.size(); i++) {
                Object valueToUser;
                ParameterMapping parameterMapping = parameterMappings.get(i);
                // #{}中参数名称,也就该和pojo类型中属性名一致
                String name = parameterMapping.getName();
                // 使用反射获取指定name的值
                Class<?> clazz = param.getClass();
                // 获取指定名称的属性对象
                Field field = clazz.getDeclaredField(name);
                field.setAccessible(true);
                valueToUser = field.get(param);
                statement.setObject(i + 1, valueToUser);
            }

        }


    }

    private PreparedStatement createStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private BoundSql getBoundSql(SqlSource sqlSource, Object param) {
        return sqlSource.getBoundSql(param);
    }

    private Connection getConnection(Configuration configuration) throws SQLException {
        DataSource dataSource = configuration.getDataSource();
        return dataSource.getConnection();
    }
}
