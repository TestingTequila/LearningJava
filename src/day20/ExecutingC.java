package day20;

public class ExecutingC {
    public static void main(String[] args) {
        C c1 = new C(12, "Jason", true);
        System.out.println(c1.i);//12
        System.out.println(c1.s);//Jason
        System.out.println(c1.b);//true

        System.out.println("==================================");
        C c2 = new C("Ashish", false);
        System.out.println(c2.i);//0
        System.out.println(c2.s);//Ashish
        System.out.println(c2.b);//false

        System.out.println("=========================");
        C c3 = new C();
        System.out.println(c3.i);
        System.out.println(c3.s);
        System.out.println(c3.b);

    }
}
