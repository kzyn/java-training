package day2.chapter7.section1;

interface Command {

    /**
     * コマンドの名前を得る
     * @return コマンド名
     */
    String getCommandName();

    /**
     * コマンドを実行する
     */
    void exec();

    /**
     * コマンドの実行が終了したときにシステム全体を終了するか返す
     * @return システムを終了するか(終了する場合はtrue)
     */
    boolean isEnd();
}
