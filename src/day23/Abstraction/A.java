package day23.Abstraction;

public class A extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum =a+b;
        System.out.println("Addition By A: " + sum);
    }
}
