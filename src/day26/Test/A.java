package day26.Test;

public abstract class A implements I
{
    public A()
    {
        System.out.println("Parent Abstract class Constructor : ");
    }
    public A(int a)
    {
        System.out.println("Parent Abstract class Constructor : " + a);
    }
    public abstract void iAmAbstract();
}
