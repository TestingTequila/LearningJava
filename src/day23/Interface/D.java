package day23.Interface;

public class D implements Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 4*a+b;
        System.out.println("A Addition:" + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 4*a-b;
        System.out.println("A subtraction:" + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 4*a*b;
        System.out.println("A product:" + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 4*a/b;
        System.out.println("A division:" + divide);
    }
}
