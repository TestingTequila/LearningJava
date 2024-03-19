package day19;

public class Employee {
    public Employee() {
        System.out.println(" Default Constructor.....");
    }

    public Employee(int a) {
        System.out.println("Constructor with 1 parameter....." + a);
    }

    public Employee(int a, int b) {
        System.out.println("Constructor with 2 parameter....." + a + ": " + b);
    }

    public Employee(String name) {
        System.out.println("Constructor with 1 parameter....." + name);
    }

    public Employee(String name, int age) {
        System.out.println("Constructor with 2 parameter....." + name + " :and age :" + age);
    }
}
