package day23;

public class BMW extends Car
{

    public  void start()
    {
        System.out.println("BMW -----start");
    }

    public  void autoParking()
    {
        System.out.println("BMW -----auto parking");
    }

    @Override
    public  void electricFuel()
    {
        System.out.println("BMW----Electric fuel");
    }
}
