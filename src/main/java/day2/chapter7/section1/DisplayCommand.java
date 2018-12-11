package day2.chapter7.section1;

class DisplayCommand implements Command {

    @Override
    public String getCommandName() {
        return "表示";
    }

    @Override
    public void exec() {
        for (String str : AddCommand.content.getLines()) {
            System.out.println(str);
        }
    }

    @Override
    public boolean isEnd() {
        return false;
    }
}
