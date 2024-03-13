package day16;

public class ExecutingMethods
{

    public static void main(String[] args) {
        MethodWithoutParametersAndMethodsWithReturnType mwpamwrt = new MethodWithoutParametersAndMethodsWithReturnType();
        mwpamwrt.a=12;
        mwpamwrt.b=8;
        //int total =mwpamwrt.addition1(); // void
        //System.out.println(total*5);

        int total1=mwpamwrt.addition2(); // int
        System.out.println(total1*5);
        mwpamwrt.word="Hello";
        String finalWord=mwpamwrt.printHello();
        System.out.println(finalWord + " Everyone");
    }

}
