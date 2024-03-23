package day23;

public class Vehicle
{
    public  void electricFuel()
    {
        System.out.println("Vehicle----Electric fuel");
    }

    public  void electricFuel(int engineCount)
    {
        System.out.println("Vehicle----Electric fuel" + engineCount);
    }

    public static void  stop()
    {
        System.out.println("Vehicle------Stop");
    }

    public static void  stop( int a)
    {
        System.out.println("Vehicle------Stop" + a);
    }


    public  final  void testingFinalInheritance()
    {
        System.out.println("testingFinalInheritance");
    }
}
