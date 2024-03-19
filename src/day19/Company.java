package day19;

public class Company
{
    String companyName;

    public Company(String companyName, int employeeCount, String location) {
        this.companyName = companyName;
        this.employeeCount = employeeCount;
        this.location = location;
    }

    public Company(String companyName, int employeeCount, String location, double turnover) {
        this.companyName = companyName;
        this.employeeCount = employeeCount;
        this.location = location;
        this.turnover = turnover;


    }

    public Company(String companyName, double turnover) {
        this.companyName = companyName;
        this.turnover = turnover;
    }

    public Company(String companyName, int employeeCount) {
        this.companyName = companyName;
        this.employeeCount = employeeCount;
    }

    public  void IsSoftwareCompany()
    {
        if(companyName.equals("Microsoft"))
        {
            System.out.println("This is a software Company");
        }
        else {
            System.out.println("Not a software Company");
        }
    }
    int employeeCount;
    String location;
    double turnover;
}
