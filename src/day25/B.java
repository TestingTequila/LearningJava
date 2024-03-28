package day25;

public class B extends A
{
    public B()
    {
        System.out.println("Child class B constructor");
    }

    @Override
    public void calculateTax() {
        System.out.println("Class B ---calculateTax");
    }
}
