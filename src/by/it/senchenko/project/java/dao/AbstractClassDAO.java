package by.it.senchenko.project.java.dao;

import by.it.senchenko.project.java.CN;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class AbstractClassDAO {
    protected int executeUpdate(String sql) {
        int result = -1;
        try (Connection connection = CN.getConnection();
             Statement statement = connection.createStatement()) {
            result = statement.executeUpdate(sql);
            //если это была вставка вернем ключ, а иначе вернем число записей
            if (sql.trim().toUpperCase().startsWith("INSERT")) {
                ResultSet resultSet = statement.executeQuery("SELECT LAST_INSERT_ID();");
                if (resultSet.next()) result = resultSet.getInt(1);
            }
        } catch (Exception e) {}
        return result;
    }
}
