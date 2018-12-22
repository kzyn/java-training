package day3.chapter8.section1;

class DatabaseAccessExercise {
    public static void main(String[] args) {
        DatabaseAccess databaseAccess = new DatabaseAccess();

        databaseAccess.init("jdbc:h2:tcp://localhost/~/test", "sa", "");
        databaseAccess.selectAll();
        databaseAccess.close();
    }
}
