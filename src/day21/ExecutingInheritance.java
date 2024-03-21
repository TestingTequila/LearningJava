package day21;

public class ExecutingInheritance
{
    public static void main(String[] args) {

        System.out.println("=======================Class A======================");

        A a = new A();
        a.addition(12,4);

        System.out.println("=======================Class B======================");
        B b = new B();
        b.addition(12,4);
        b.subtraction(12,4);

        System.out.println("=======================Class C======================");
        C c = new C();
        c.addition(12,4);
        c.subtraction(12,4);
        c.multiplication(12,4);


        System.out.println("=======================Class D======================");
        D d = new D();
        d.addition(12,4);
        d.subtraction(12,4);
        d.multiplication(12,4);
        d.division(12,4);


    }
}
