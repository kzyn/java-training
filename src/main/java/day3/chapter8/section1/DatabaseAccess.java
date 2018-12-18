package day3.chapter8.section1;

import java.sql.*;

class DatabaseAccess {
    protected Connection connection;

    private static final String url = "jdbc:h2:tcp://localhost/~/test";
    private static final String user = "sa";
    private static final String password = "";

    DatabaseAccess() {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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
