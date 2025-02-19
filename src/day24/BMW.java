package day24;

public class BMW extends Car
{
    public  void autoParking()
    {
        System.out.println("BMW----autoParking");
    }

   @Override
    public void start()
    {
        System.out.println("BMW---Starting");
    }

    public static void billing()
    {
        System.out.println("BMW---Billing");
    }

    //method with final keyword cannot be inherited

//    public static final void display()
//    {
//        System.out.println("Car----Display");
//    }

    @Override
    public  void payment()
    {
        System.out.println("BMW---Payment");
    }

    @Override
    public  void payment(int a)
    {
        System.out.println("BMW---Payment" + a);
    }

    public  void payment(int a, String b)
    {
        System.out.println("BMW---Payment" + a + b);
    }

    //2. Overload an overridden method


    public static void billing(int z)
    {
        System.out.println("BMW---Billing");
    }

    @Override
    public  void engine()
    {
        System.out.println("BMW Engine....");
    }
}

//inherit Yes + Override No
//Inherit No

// static + final --> Inherit No

//Overload an overridden static method