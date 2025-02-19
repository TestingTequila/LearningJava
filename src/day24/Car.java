package day24;

public class Car extends  Vehicle
{
    public void start()
    {
        System.out.println("Car---Starting");
    }

    public void stop()
    {
        System.out.println("Car---stopping");
    }

    public void refuel()
    {
        System.out.println("Car---refueling");
    }

    // static method can never be overridden
    public static void billing()
    {
        System.out.println("Car---Billing");
    }

    public static final void display()
    {
        System.out.println("Logo----Display");
    }

    //1. Override an overloaded method
    public  void payment()
    {
        System.out.println("Car---Payment");
    }

    public  void payment(int a)
    {
        System.out.println("Car---Payment" + a);
    }

    //3. Override an overloaded static method

    public static void billing(int z)
    {
        System.out.println("Car---Billing");
    }

    @Override
    public  void engine()
    {
        System.out.println("Car Engine....");
    }

}
