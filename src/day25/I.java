package day25;

public interface I
{
    final String name="Jason";
    public  void TimeCalculation();

    public static void billing()
    {
        System.out.println("Parent Interface ----Billing");
    }

    default void totalTerm()
    {
        System.out.println("Interface --DefaultMethod: totalTerm ");
    }
}
