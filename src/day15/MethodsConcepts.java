package day15;

public class MethodsConcepts {

    // I want to perform addition of 2 integer numbers
     int a; // Class variables/ Global Variable
     int b;


    public void addition()
    {
        int sum =a+b;
        System.out.println("Addition of " + a + " and " + b + " is : " + sum);
    }

    // I want to perform subtraction of two integer numbers
    public void subtraction()
    {
        int difference=a-b;
        System.out.println("The difference of " + a + " and " + b +" is " + difference);
    }

    public void addition1(int a, int b)
    {
        int product=a*b;
        System.out.println("The multiplication of " + a + " and " + b +" is " + product);
    }

    public void subtraction(int a , int b)
    {
        int difference=a-b;
        System.out.println("The difference of " + a + " and " + b +" is " + difference);
    }

    public void addition3()
    {
        int a=12;
        int b=8;
        int sum =a+b;
        System.out.println("ADDITION : " + sum);
    }





}
