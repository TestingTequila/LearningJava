package day16;

public class SalaryCalculation
{
    // whatever be the salary of every employee, we are going to provide a bonus of $1000 for every employee
    //1. Calculate the salary of every employee
    //2. We have to add bonus to the salary




    public double calculateSalary(double basicSalary,double travelAllowance )
    {
        double empSalary=basicSalary + travelAllowance;
        System.out.println(empSalary);
        return empSalary;
    }
}
