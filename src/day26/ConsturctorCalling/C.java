package day26.ConsturctorCalling;

public class C extends P{

    public C()
    {
        super("Jason");
        System.out.println("Child Class Default Constructor..");
    }

    public C(String s)
    {
        super("Rohit");
        System.out.println("Child Class Parametrized Constructor.." + s);
    }
}
