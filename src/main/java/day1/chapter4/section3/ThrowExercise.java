package day1.chapter4.section3;

public class ThrowExercise {

    public static void main(String args[]) {
        try {
            User suziki = new User("鈴木", 20);
            System.out.printf("名前: %s 年齢: %d\n", suziki.getName(), suziki.getAge());

            User sato = new User("佐藤", -1);
            System.out.printf("名前: %s 年齢: %d\n", sato.getName(), sato.getAge());
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
