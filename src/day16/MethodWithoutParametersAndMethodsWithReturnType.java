package day16;

public class MethodWithoutParametersAndMethodsWithReturnType
{
    int a ;
    int b;

    String word;

    public void addition1()
    {
        int sum = a+b;
        System.out.println("The sum of " + a + " and " + b+ " is :" + sum);
    }

    public int addition2()
    {
        int sum = a+b;
        System.out.println("The sum of " + a + " and " + b+ " is :" + sum);
        return b;
    }

    public  String printHello()
    {
        return word;
    }
}
