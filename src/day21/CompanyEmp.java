package day21;

public class CompanyEmp {
    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private String empName;
    private int salary;


    public String printEmployeeName() {
        String empName = null;
        if (getEmpName().equals("Kerrie") || getEmpName().equals("Jason")) {
            empName = getEmpName();
        }
        return empName;
    }

    public int printEmployeeSalary() {
        int empSalary = 0;
        if (getSalary() > 1000 && getSalary() < 10000) {
            empSalary = getSalary();

        }
        return empSalary;
    }

    public void PayEmployeeSalary() {
        System.out.println("Pay " + printEmployeeName() + " a salary of " + "$" + printEmployeeSalary());
    }
}


