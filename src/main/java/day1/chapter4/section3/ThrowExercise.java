package day1.chapter4.section3;

public class ThrowExercise {

    public static void main(String args[]) {
        try {
            User suziki = new User("鈴木", 20);
            suziki.printUser();

            User sato = new User("佐藤", -1);
            sato.printUser();
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
