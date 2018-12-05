package day1.chapter4.section1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSizeUtils {

    public boolean sizeEquals(String filePath1, String filePath2) {
        try {
            Path path1 = Paths.get(filePath1);
            Path path2 = Paths.get(filePath2);
            return Files.size(path1) == Files.size(path2);
        } catch (IOException e) {
            return false;
        }
    }

    static final int SIZE_1KB = 1024;

    public boolean isLessThan1KB(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.size(path) < SIZE_1KB;
        } catch (IOException e) {
            return false;
        }
    }
}
