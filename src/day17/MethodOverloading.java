package day17;

public class MethodOverloading
{
    public void addition(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public int addition(int a, int b, String x)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
        return  sum;
    }

    public void addition(int a, int b, int c)
    {
        int sum =a+b+c;
        System.out.println("Addition : " + sum);
    }

    public void addition(byte a, byte b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(byte a, int b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(int a, byte b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(short a, int b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(int a, short b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(short a, short b)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(short a, short b, int c)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }

    public void addition(short a, short b, String c)
    {
        int sum =a+b;
        System.out.println("Addition : " + sum);
    }


}
