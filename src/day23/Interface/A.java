package day23.Interface;

public class A implements Base
{

    @Override
    public void addition(int a, int b) {
        int sum = a+b;
        System.out.println("A Addition:" + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = a-b;
        System.out.println("A subtraction:" + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = a*b;
        System.out.println("A product:" + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = a/b;
        System.out.println("A division:" + divide);
    }
}
