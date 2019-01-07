package day3.chapter8.section1;

import java.sql.SQLException;

class DatabaseAccessExercise {
    public static void main(String[] args) {
        try (DatabaseAccess databaseAccess = new DatabaseAccess()) {
            databaseAccess.init("jdbc:h2:tcp://localhost/~/test", "sa", "");
            databaseAccess.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
