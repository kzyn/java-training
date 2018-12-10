package day1.chapter4.section3;

public class User {
    private String name;
    private int age;

    public  User(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
             throw new InvalidAgeException("年齢が不正です。");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void printUser() {
        System.out.printf("名前: %s 年齢: %d\n", this.name, this.age);
    }
}
