package day3.chapter8.section2;

import java.sql.*;

public class H2Access implements DatabaseAccess {
    protected Connection connection;

    @Override
    public void init(String url, String user, String password) {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        try {
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll() {
        try (PreparedStatement statement = connection.prepareStatement("select id, name, price from ITEM order by id");
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("id"));
                System.out.println("name: " + resultSet.getString("name"));
                System.out.println("price: " + resultSet.getInt("price"));
                System.out.println("---");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
