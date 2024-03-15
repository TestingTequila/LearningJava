package day17.StaticConcept;

public class Car
{
    String name;
    int price;
    String color;
    final static int wheels =4;

    public  void start()
    {
        System.out.println("Car---- start");
    }

    public static void speedTest()
    {
        System.out.println("Car ----speed test");
    }
}
