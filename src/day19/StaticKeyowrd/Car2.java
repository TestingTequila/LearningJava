package day19.StaticKeyowrd;

public class Car2
{
    String name;
    int price;
    String color;
    static int wheels=4;

    public void start()
    {
        System.out.println("Car ---start");
        String s= name;
    }

    public void stop()
    {
        System.out.println("Car ---stop");
        start();
        int s= price;
    }

    public static void speedTest()
    {
        System.out.println("Car----speedTest");

    }
    public static void speedMax()
    {
        System.out.println("Car----speedMax");
    }
}


//Common Property Value should be made static
//static keyword does not belong to Object but rather belongs to the class
//static keyword variable/method, they should called using the className to which they belong