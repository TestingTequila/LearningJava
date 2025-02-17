package day22;

public class EcomApplication {

    public EcomApplication(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    String name;
    int age;
    boolean isMarried;
    private String lName;

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

}
