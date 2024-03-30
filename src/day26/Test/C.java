package day26.Test;

public class C extends A {

    public C()
    {
        System.out.println("Child class C constructor");
    }

    @Override
    public void iAmAbstract() {
        System.out.println("iAmAbstract");
    }

    @Override
    public void iAmInterface() {
        System.out.println("iAmInterface");
    }
}
