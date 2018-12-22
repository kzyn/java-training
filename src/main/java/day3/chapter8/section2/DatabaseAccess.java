package day3.chapter8.section2;

interface DatabaseAccess {

    void init(String url, String user, String password);

    void close();

    void selectAll();
}
