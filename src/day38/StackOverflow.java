package day38;

public class StackOverflow
{
    public  void m1() throws InterruptedException
    {
        System.out.println(" m1 method");
        m2();
    }

    public  void m2() throws InterruptedException
    {
        System.out.println(" m1 method");
        m3();
    }

    public  void m3() throws  InterruptedException
    {
        System.out.println(" m1 method");
        m4();
    }
    public  void m4() throws InterruptedException
    {
        System.out.println(" m1 method");
        m1();
    }
}
