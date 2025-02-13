package day20;

public class ExecutingA {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.x);
        System.out.println(a1.s);
        System.out.println(a1.b1);
        a1.m1(); //Calling m1 method
    }
}

//Constructor is like a method
//Name of constructor is same as name of the Class
//Constructor cannot have returnType including void
//Constructor helps in creating the object
//Constructor is called automatically the moment you create object
