package day2.chapter7.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * コンソールから入力された文字列を保持するクラス
 */
class Content {
    private List<String> lines;

    public Content() {
        lines = new ArrayList<>();
    }

    public void addLine(String line) {
        lines.add(line);
    }

    public List<String> getLines() {
        return new ArrayList<>(lines);
    }

}
