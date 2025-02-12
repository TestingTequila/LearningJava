package day19.StaticKeyowrd;

public class Car
{
    String name;
    int price;
    String color;
    static int wheels=4;

    public void start()
    {
        System.out.println("Car ---start");

    }
    public void stop()
    {
         int x =20;
        System.out.println("Car ---stop");
        Car.speedTest();

    }

    public static void speedTest()
    {
        System.out.println("Car----speedTest");
        Car c1 = new Car();
        c1.start();

    }
    public static void engineTest()
    {
        System.out.println("Car----engineTest");
    }

}


//Common Property Value should be made static
//static keyword does not belong to Object but rather belongs to the class
//static keyword variable/method, they should called using the className to which they belong