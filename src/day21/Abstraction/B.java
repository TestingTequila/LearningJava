package day21.Abstraction;

public class B extends Base
{

    @Override
    public void addition(int a, int b) {
        int sum =2*a+2*b;
        System.out.println("Addition by B: " + sum);
    }
}
