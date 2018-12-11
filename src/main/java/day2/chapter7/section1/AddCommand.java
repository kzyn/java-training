package day2.chapter7.section1;

import java.util.Scanner;

/**
 * コンソールから入力された文字列を追加するコマンド
 */
class AddCommand implements Command {

    static Content content;

    public AddCommand(Content content) {
        this.content = content;
    }

    @Override
    public String getCommandName() {
        return "追加";
    }

    @Override
    public void exec() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("追加する文字列 : ");
        content.addLine(scanner.nextLine());
    }

    @Override
    public boolean isEnd() {
        return false;
    }
}
