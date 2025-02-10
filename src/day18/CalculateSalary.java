package day18;

public class CalculateSalary
{
    int total;
    public int salaryCalculation(int basicSalary,int travelAllowance )
    {
        total = basicSalary + travelAllowance;
        return total;
    }

    public void salaryWithBonus(int bonusAmount)
    {
        System.out.println((total + bonusAmount));
    }
}


// Jo bhi salary hogi employees ki, hum uspar 500Rs holi bonus denge

//calculate salary ---> basicSalary + travelling Allowance