package day29.AccessModifiers;

public class C
{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.Name);
        System.out.println(a.pro);
        //System.out.println(a.pri);// private
    }
}
