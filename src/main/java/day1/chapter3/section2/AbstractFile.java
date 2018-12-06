package day1.chapter3.section2;

public abstract class AbstractFile {
    String name;

    public abstract String getExtension();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return this.name + "." + getExtension();
    }

}
