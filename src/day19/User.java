package day19;

public class User {
    String name;
    int age;
    String email;
    String password;
    String phone;

    public  User(String name, int age, String email, String password, String phone)
    {
        this.name = name;
        this.age=age;
        this.email=email;
        this.password=password;
        this.phone =phone;
    }
    public User(String name)
    {
         this.name = name;
    }

    public User(String name, int age)
    {
        this.name = name;
        this.age =age;
    }

    public User(String name, int age, String email)
    {
        this.name = name;
        this.age =age;
        this.email = email;
    }


    public User(String email, String password)
    {
        this.password =password;
        this.email = email;
    }

}
