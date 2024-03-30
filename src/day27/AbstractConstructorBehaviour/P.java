package day27.AbstractConstructorBehaviour;

public abstract class P
{
    public P()
    {
        System.out.println("Parent Abstract Class P DEFAULT Constructor");
    }

    public P(String name)
    {
        System.out.println("Parent Abstract Class PARAMETRIZED Constructor: " + name);
    }
}
