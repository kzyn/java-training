package day1.chapter4.section1;

public class ExceptionExercise {
    static final String filePath1 = "src/main/resources/2KBFile";
    static final String filePath2 = "src/main/resources/0.5KBFile1";
    static final String filePath3 = "src/main/resources/0.5KBFile2";

    public static void main(String[] args) {
        FileSizeUtils fileSizeUtils = new FileSizeUtils();

        System.out.println(fileSizeUtils.sizeEquals(filePath1, filePath2));
        System.out.println(fileSizeUtils.sizeEquals(filePath2, filePath3));
        System.out.println(fileSizeUtils.isLessThan1KB(filePath1));
        System.out.println(fileSizeUtils.isLessThan1KB(filePath2));
    }
}
