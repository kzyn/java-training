package day1.chapter3.section2;

public class AbstractClassExercise {
    static final String SAMPLE_FILE_NAME = "新規テキストファイル";

    public static void main(String args[]) {
        AbstractFile a = new TextFile();

        a.setName(SAMPLE_FILE_NAME);
        System.out.println(a.getName());
        System.out.println(a.getFullName());
    }
}
