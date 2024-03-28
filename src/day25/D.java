package day25;

public class D implements I{
    @Override
    public void TimeCalculation() {
        System.out.println("===TimeCalculation===");
    }


    public static void billing()
    {
        System.out.println("Child class D ---Billing");
    }

    @Override
    public void totalTerm()
    {
        System.out.println("Child Class --DefaultMethod: totalTerm ");
    }
}
