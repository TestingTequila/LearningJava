package day22.Inheritance;

public class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car------start");
    }

    @Override
    public void stop()
    {
        System.out.println("Car------stop");
    }

    public void refuel()
    {
        System.out.println("Car------refuel");
    }
}
