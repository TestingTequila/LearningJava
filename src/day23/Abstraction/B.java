package day23.Abstraction;

public class B extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum =2*a+b;
        System.out.println("Addition By B: " + sum);
    }
}
