package day2.chapter7.section1;

/**
 * システムを終了するコマンド
 */
class ExitCommand implements Command {

    @Override
    public String getCommandName() {
        return "終了";
    }

    @Override
    public void exec() {
        System.out.println("終了します");
    }

    @Override
    public boolean isEnd() {
        return true;
    }
}
