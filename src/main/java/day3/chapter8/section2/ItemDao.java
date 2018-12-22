package day3.chapter8.section2;

import java.sql.*;

class ItemDao {
    private H2Access h2Access = new H2Access();

    public void init(String url, String user, String password) {
        this.h2Access.init(url, user, password);
    }

    public void close() {
        this.h2Access.close();
    }

    public void selectAll() {
        this.h2Access.selectAll();
    }

    public void insert(int id, String name, int price) {
        try (PreparedStatement statement = this.h2Access.connection.prepareStatement("insert into ITEM(id, name, price) values(?, ?, ?)")) {

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, price);

            System.out.println(statement.executeUpdate() + "行が挿入されました。");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
