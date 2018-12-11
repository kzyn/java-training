package day2.chapter7.section1;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * メニューを表示するコマンド
 */
class MainCommand implements Command {

    @Override
    public String getCommandName() {
        return "メニュー";
    }

    @Override
    public void exec() {
        // コマンドごとに内容を持ち越せるよう、ここでContentを生成する
        Content content = new Content();
        Map<Integer, Command> commandMap = createCommandMap(content);
        boolean isContinue = true;
        while (isContinue) {
            Command command = getCommand(commandMap);
            command.exec();
            if (command.isEnd()) {
                isContinue = false;
            }
        }
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    private Command getCommand(Map<Integer, Command> commandMap) {
        Command command = commandMap.get(getMenuNumber(commandMap));
        return command == null ? new ExitCommand() : command;
    }

    private int getMenuNumber(Map<Integer, Command> commandMap) {
        System.out.println("----------------------------------");
        commandMap.entrySet().stream()
                .forEach(s -> System.out.println("[" + s.getKey() + "] " + s.getValue().getCommandName()));
        System.out.print("メニュー番号を選択してください : ");

        int menu = 0;
        try {
            menu = new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("メニュー番号を指定してください");
        }
        return menu;
    }

    // 新しいコマンドを追加するときは、このメソッドのcommandMapに追加する
    private Map<Integer, Command> createCommandMap(Content content) {
        int index = 0;
        Map<Integer, Command> commandMap = new TreeMap<>();
        commandMap.put(index++, new ExitCommand());
        commandMap.put(index++, new AddCommand(content));
        commandMap.put(index++, new DisplayCommand(content));
        return commandMap;
    }
}
