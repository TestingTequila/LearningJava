package day22;

public class D implements Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 4*a+4*b;
        System.out.println("Addition by D: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 4*a-4*b;
        System.out.println("Subtraction by D: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 4*a*b;
        System.out.println("Multiplication by D: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 4*(a/b);
        System.out.println("Division by D: " + divide);
    }
}
