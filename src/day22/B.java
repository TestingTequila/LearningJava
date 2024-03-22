package day22;

public class B implements Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+2*b;
        System.out.println("Addition by A: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 2*a-2*b;
        System.out.println("Subtraction by B: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 2*a*b;
        System.out.println("Multiplication by B: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 2*(a/b);
        System.out.println("Division by B: " + divide);
    }
}
