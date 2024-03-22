package day22;

public class C implements  Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 3*a+3*b;
        System.out.println("Addition by C: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 3*a-3*b;
        System.out.println("Subtraction by C: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 3*a*b;
        System.out.println("Multiplication by C: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 3*(a/b);
        System.out.println("Division by C: " + divide);
    }
}
