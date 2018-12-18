package day3.chapter8.section2;

import java.sql.*;

abstract class DatabaseAccess {
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

    public abstract void selectAll();

    public abstract void insert(int id, String name, int price);
}
