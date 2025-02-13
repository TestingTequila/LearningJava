package day21;

public class Registration
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

    public  Registration(String fName, String lName, int age, String city, boolean isMarried )
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
}
