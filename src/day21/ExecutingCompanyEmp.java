package day21;

public class ExecutingCompanyEmp
{
    public static void main(String[] args) {
      CompanyEmp ec  = new CompanyEmp();
      ec.setEmpName("Jason");
      ec.setSalary(6000);
      String empNameIs=ec.printEmployeeName();
      int salary= ec.printEmployeeSalary();
        ec.PayEmployeeSalary();
    }
}
