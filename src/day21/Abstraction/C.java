package day21.Abstraction;

public class C extends  Base
{

    @Override
    public void addition(int a, int b) {
        int sum =3*a+3*b;
        System.out.println("Addition by C: " + sum);
    }
}
