package com.test;

import java.sql.*;

public class MySQLFakeData {

    public void addFakeDataToTheClientTable(int length) {
        String timezone = "?useUnicode=true&serverTimezone=UTC";
        String url = "jdbc:mysql://127.0.0.1:3306/test_database" + timezone;
        String username = "root";
        String password = "Ds11223344";
        String sqlStatement = "INSERT INTO client(first_name, last_name, address, account_number, phone) " +
                "VALUES(?, ?, ?, ?, ?)";
        String sqlQuery = "select * from client";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sqlStatement);
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            for (int i = 0; i < length; i++) {
                statement.setString(1, new FakeValueServices().getFirstname());
                statement.setString(2, new FakeValueServices().getLastname());
                statement.setString(3, new FakeValueServices().getAddress());
                statement.setString(4, new FakeValueServices().getAccountNumber());
                statement.setString(5, new FakeValueServices().getPhone());
                statement.addBatch();
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) +
                            " " + resultSet.getString(3) + " " + resultSet.getString(4) +
                            " " + resultSet.getString(5) + " " + resultSet.getString(6));
                }
            }
            statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
