package day23;

public class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car------start");
    }

    public static void  stop()
    {
        System.out.println("Car------Stop");
    }

//    @Override
//    public static void  stop( int a)
//    {
//        System.out.println("Vehicle------Stop" + a);
//    }


    @Override
    public  void electricFuel(int engineCount)
    {
        System.out.println("Car----Electric fuel" + engineCount);
    }

    public  void electricFuel(int engineCount, String carName)
    {
        System.out.println("Car----Electric fuel" + engineCount + ": " + carName);
    }

    public void refuel()
    {
        System.out.println("Car------refuel");
    }


}
