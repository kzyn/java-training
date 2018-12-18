package day3.chapter8.section2;

import java.sql.*;

class ItemDao extends DatabaseAccess {
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

    @Override
    public void insert(int id, String name, int price) {
        try (PreparedStatement statement = connection.prepareStatement("insert into ITEM(id, name, price) values(?, ?, ?)")) {

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, price);

            System.out.println(statement.executeUpdate() + "行が挿入されました。");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
