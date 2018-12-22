package day3.chapter8.section2;

class DatabaseAccessExercise {
    public static void main(String[] args) {
        ItemDao itemDao = new ItemDao();

        itemDao.init("jdbc:h2:tcp://localhost/~/test", "sa", "");
        itemDao.insert(3, "ボールペン", 150);
        itemDao.selectAll();
        itemDao.close();
    }
}
