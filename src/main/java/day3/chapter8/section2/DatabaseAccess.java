package day3.chapter8.section2;

import java.sql.*;

class DatabaseAccess implements AutoCloseable {
    private Connection connection;

    public void init(String url, String user, String password) {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAll() {
        try (PreparedStatement statement = this.connection.prepareStatement("select id, name, price from ITEM order by id");
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

    public void insert(int id, String name, int price) {
        try (PreparedStatement statement = this.connection.prepareStatement("insert into ITEM(id, name, price) values(?, ?, ?)")) {

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, price);

            System.out.println(statement.executeUpdate() + "行が挿入されました。");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws SQLException {
        this.connection.close();
    }
}
