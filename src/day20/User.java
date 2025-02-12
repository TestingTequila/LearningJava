package day20;

public class User {
    String name;
    int age;
    String emailId;
    String password;
    long phone;

    public User(String name, int age, String emailId, String password, long phone) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.password = password;
        this.phone = phone;
    }

    public User(String name, int age, String emailId, String password) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.password = password;
    }

    public User(String name, int age, long phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
