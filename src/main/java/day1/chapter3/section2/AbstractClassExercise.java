package day1.chapter3.section2;

public class AbstractClassExercise {
    static final String SAMPLE_FILE_NAME = "新規テキストファイル";

    public static void main(String[] args) {
        AbstractFile abstractFile = new TextFile();

        abstractFile.setName(SAMPLE_FILE_NAME);
        System.out.println(abstractFile.getName());
        System.out.println(abstractFile.getFullName());
    }
}
