package day20;

public class RegisterPage
{
    public RegisterPage(String name, int age, String address, String dob)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.dob = dob;
    }
    private  String name; // Jason
    private int age;//25
    private String address;//London
    private String dob;// 25/12/1999

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
