package day18;

public class ExecutingName
{
    public static void main(String[] args) {
        EmployeeIdGeneration emp1= new EmployeeIdGeneration();
        emp1.fName =emp1.empFullName("Ashish", "Mishra"); //Ashish
        System.out.println(emp1.finalNameOnIdCard());


    }
}
