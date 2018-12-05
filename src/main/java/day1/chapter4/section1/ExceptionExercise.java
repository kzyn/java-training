package day1.chapter4.section1;

public class ExceptionExercise {
    static final String filePath1 = "src/main/resources/2KBFile";
    static final String filePath2 = "src/main/resources/0.5KBFile1";
    static final String filePath3 = "src/main/resources/0.5KBFile2";

    public static void main(String args[]) {
        FileSizeUtils f = new FileSizeUtils();

        System.out.println(f.sizeEquals(filePath1, filePath2));
        System.out.println(f.sizeEquals(filePath2, filePath3));
        System.out.println(f.isLessThan1KB(filePath1));
        System.out.println(f.isLessThan1KB(filePath2));
    }
}
