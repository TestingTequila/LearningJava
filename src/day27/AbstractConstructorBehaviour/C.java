package day27.AbstractConstructorBehaviour;

public class C extends P
{
    public C()
    {
        System.out.println("Child class C DEFAULT Constructor");
    }

    public C(int a)
    {
        System.out.println("Child class C PARAMETRIZED Constructor : " + a);
    }

//    public void captureCheckbox(String name)
//    {
//        a[text()='"+name+"']/parent::td/preceding-sibling::td
//    }
}
