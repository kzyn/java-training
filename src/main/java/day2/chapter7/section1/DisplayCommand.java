package day2.chapter7.section1;

class DisplayCommand implements Command {

    private Content content;

    public DisplayCommand(Content content) {
        this.content = content;
    }

    @Override
    public String getCommandName() {
        return "表示";
    }

    @Override
    public void exec() {
        for (String str : this.content.getLines()) {
            System.out.println(str);
        }
    }

    @Override
    public boolean isEnd() {
        return false;
    }
}
