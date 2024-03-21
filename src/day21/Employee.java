package day21;

public class Employee
{
    String name; // Amrita
    int age;     //25

    public int add(int a, int b)
    {
        System.out.println("sum of two numbers");
        int sum = a+b;
        return sum;
    }

    public void getInfo(Employee emp)
    {
        emp.age =25;
    }
}
