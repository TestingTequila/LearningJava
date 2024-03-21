package day21;

public class ExecutingEmployee
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        //int total=e1.add(12, 8); // Call by value
        //System.out.println("Total of two numbers is: " + total);

        e1.getInfo(e1); // Call by Reference

        System.out.println(e1.name + " : " + e1.age); // Null : 25

        e1.name = "John";

        System.out.println(e1.name + " : " + e1.age); // John : 25
    }
}
