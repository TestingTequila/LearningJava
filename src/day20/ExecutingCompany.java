package day20;

public class ExecutingCompany
{
    public static void main(String[] args) {
        Company comp = new Company();
        comp.setName("Microsoft");
        comp.setEmpCount(15000);
        comp.setSharePrice(1200);

        System.out.println(" Company Name: " + comp.getName() + " and Employee count is : " + comp.getEmpCount() + " and the share price is : " + comp.getSharePrice());

    }
}
