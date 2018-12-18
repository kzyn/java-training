package day3.chapter8.section2;

class DatabaseAccessExercise {
    public static void main(String[] args) {
        DatabaseAccess itemDao = new ItemDao();

        itemDao.insert(3, "ボールペン", 150);
        itemDao.selectAll();
    }
}
