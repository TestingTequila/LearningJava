package day21.Abstraction;

public class ExecutingAbstraction
{
    public static void main(String[] args) {

        System.out.println("=======================A=========================");
        A a = new A();
        a.addition(12,4); //a+b --> 16
        a.subtraction(12,4);
        a.multiplication(12,4);
        a.division(12,4);

        System.out.println("=======================B=========================");
        B b = new B();
        b.addition(12,4); // 2*a+2*b --> 32
        b.subtraction(12,4);
        b.multiplication(12,4);
        b.division(12,4);

        System.out.println("=======================C=========================");
        C c = new C();
        c.addition(12,4); // 3*a+3*b -->48
        c.subtraction(12,4);
        c.multiplication(12,4);
        c.division(12,4);

        System.out.println("=======================D=========================");
        D d = new D();
        d.addition(12,4); // 4*a+4*b -->64
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);

        //Base base = new Base(); Cannot create object of Abstract class


    }
}
