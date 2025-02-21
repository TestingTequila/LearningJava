package day23.Interface;

public class B implements Base {

    @Override
    public void addition(int a, int b) {
        int sum = 2 * a + b; //2*12+4
        System.out.println("A Addition:" + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 2 * a - b;
        System.out.println("A subtraction:" + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 2 * a * b;
        System.out.println("A product:" + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 2 * a / b;
        System.out.println("A division:" + divide);
    }
}
