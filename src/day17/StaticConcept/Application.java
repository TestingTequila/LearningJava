package day17.StaticConcept;

import java.util.SortedMap;

public class Application
{
    String name;

    static String trainer;
    public void m1()
    {
        System.out.println("m1 method");
        m3();
        Application.t1();


    }

    public void m2()
    {
        System.out.println("m2 method");
        m1();
        Application.t2();
        Application.t3();
    }

    public void m3()
    {
        System.out.println("m3 method");
        m1();
    }

    public static void t1()
    {
        System.out.println("m1 static method");
        trainer="Ashish";
        Application app = new Application();
        app.m1();


    }

    public static void t2()
    {
        System.out.println("t2 static  method");
        System.out.println(trainer);
        t3();
        Application ap = new Application();
        ap.m2();
        ap.name="Roger";
    }

    public static void t3()
    {
        System.out.println("t3 static  method");
        t1();
        t2();
    }
}
