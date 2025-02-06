package day17;

public class MethodWithParameterAndNoReturnType
{
    // wap to print addition of two integer numbers

    ; //Global Variable, Instance Variable
    ;
    int glbVar1; // Global Variable
    int glbVar2;

    public void addition(int x,int y) // parameters
    {
        int sum =x+y;
        System.out.println(sum);
    }

    // wap to print subtraction of two integer numbers
    public  void subtraction(int x, int y)
    {
        int difference =x-y;
        System.out.println(difference);
    }

    // wap to print multiplication of two integer numbers
    public  void multiplication(int x, int y)
    {
        int product=x*y;
        System.out.println(product);
    }

    public void division()
    {
      int x=122;
      int y=8;
      int divide =x/y;
        System.out.println(divide);
    }
}
