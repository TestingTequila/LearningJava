package day19;

public class ExecutingConstructors
{
    public static void main(String[] args) {
        Employee emp = new Employee(); // Default Constructor

        Employee emp1 = new Employee(12); // Constructor with 1 parameter

        Employee emp2 = new Employee(12, 8); // Constructor with 2 parameters

        Employee emp3 = new Employee("Jason"); // Constructor with String Parameter
        Employee emp4 = new Employee("Kerrie", 19); //// Constructor with String and int Parameter
    }
}
