package day22;

public class A
{
    String name;
    public  A()
    {
        this(32);
        System.out.println("Default Constructor");
    }

    public  A(int age)
    {
        this(24, "Swati");
        System.out.println("Constructor with int parameter" + age);
    }

    public  A(int age, String name)
    {
        System.out.println("Constructor with int parameter"+ age + " Name as  " + name);
    }

    public A m1(String name)
    {
        this.name=name;
        System.out.println("m1 method");
        this.m2();
        return this;

    }

    public void m2()
    {
        this.m3();
        System.out.println("m2 method");
    }

    public void m3()
    {
        System.out.println("m3 method");
    }

    public static void m4()
    {
        System.out.println("m4 method");
    }

    public static void m5()
    {
        System.out.println("m5 method");

    }

    public static void m6()
    {
        System.out.println("m6 method");
    }
}
