package day21;

public class Registration2
{
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public Registration2(String fName, String lName, int age, String city, boolean isMarried )
    {
       this.fName =fName;
       this.lName= lName;
       this.age=age;
       this.city=city;
       this.isMarried=isMarried;
    }
    private String fName;
    private String lName;
    private int age;
    private String city;
    private boolean isMarried;

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
