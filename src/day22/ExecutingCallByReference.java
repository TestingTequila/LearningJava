package day22;

public class ExecutingCallByReference
{
    public static void main(String[] args) {
        CallByReference cbr = new CallByReference();
        cbr.name="Kerrie";
        cbr.age=18;
        cbr.gender='f';
        System.out.println(cbr.name + ", " + cbr.age + ", " + cbr.gender);
        System.out.println("================CBR===================");
        cbr.m1(cbr);
        System.out.println(cbr.name + ", " + cbr.age + ", " + cbr.gender);


    }
}
