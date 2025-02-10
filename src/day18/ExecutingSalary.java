package day18;

public class ExecutingSalary
{
    public static void main(String[] args) {

        CalculateSalary emp1 = new CalculateSalary();
        int salary =emp1.salaryCalculation(12000, 3000);
        emp1.salaryWithBonus(500);


        CalculateSalary emp2= new CalculateSalary();
        int emp2Salary= emp2.salaryCalculation(8000, 2000);
        emp2.salaryWithBonus(500);

    }
}
