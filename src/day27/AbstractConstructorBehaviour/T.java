package day27.AbstractConstructorBehaviour;

public class T
{
    public static void main(String[] args) {
        // I i = new I(); We cannot create object of an interface and hence cannot create Constructor too within an Interface
        // P a = new P(); We cannot create object of an Abstract Class but its Constructor will be created
         C c = new C(10);
    }
}
