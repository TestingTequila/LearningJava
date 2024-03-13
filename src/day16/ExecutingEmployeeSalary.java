package day16;

public class ExecutingEmployeeSalary
{
    public static void main(String[] args) {
        SalaryCalculation sc = new SalaryCalculation();

        double jasonSalary=sc.calculateSalary(3000, 5000);
        System.out.println("JASON: " +(jasonSalary+1000));

        double kerrieSalary=sc.calculateSalary(5000, 3000);
        System.out.println("KERRY: "+(kerrieSalary+1000));

        double leeSalary=sc.calculateSalary(4000, 5000);
        System.out.println("LEE: "+(leeSalary+1000));
    }
}
