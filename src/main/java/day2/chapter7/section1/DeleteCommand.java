package day2.chapter7.section1;

class DeleteCommand implements Command {

    private Content content;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    public String getCommandName() {
        return "削除";
    }

    @Override
    public void exec() {
        this.content.deleteLine();
        System.out.println("削除しました");
    }

    @Override
    public boolean isEnd() {
        return false;
    }
}
