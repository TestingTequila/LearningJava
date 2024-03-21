package day20;

public class Company
{
    private String name;
    private int empCount;
    private int sharePrice;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEmpCount() {
        return empCount;
    }

    public void getEmpCount(int a) {

    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setEmpCount(int empCount) {
        this.empCount = empCount;
    }

    public void setSharePrice(int sharePrice) {
        if(sharePrice>=1000)
        {
            this.sharePrice =0;
        }
        else {
            this.sharePrice = sharePrice;
        }
    }
}
