package day17;

public class ExecutingAll
{
    public static void main(String[] args) {
        _1MethodWithoutParameter c1 = new _1MethodWithoutParameter();
        c1.x=12;
        c1.y=4;
        c1.addition();// 12+4 =16
        c1.subtraction(); //12-4 =8
        c1.multiplication(); //12*4 =48

        _1MethodWithoutParameter c0 = new _1MethodWithoutParameter();
        c0.x=120;
        c0.y=4;
        c0.addition();// 12+4 =16
        c0.subtraction(); //12-4 =8
        c0.multiplication(); //12*4 =48

        System.out.println("=====_2MethodWithParameter================");

        _2MethodWithParameter c2 = new _2MethodWithParameter();
        c2.addition(12,4);
        c2.subtraction(14,5);
        c2.multiplication(2,3);

        System.out.println("=====_2MethodWithParameter2================");

        _2MethodWithParameter c4 = new _2MethodWithParameter();
        c4.addition(120,4);
        c4.subtraction(14,50);
        c4.multiplication(2,30);

        System.out.println("=====_3MethodWithLocalVariable================");
        _3MethodWithLocalVariable c3= new _3MethodWithLocalVariable();
        c3.addition();
        c3.subtraction();
        c3.multiplication();
        c3.division();

        System.out.println("=====_3MethodWithLocalVariable2================");
        _3MethodWithLocalVariable c5= new _3MethodWithLocalVariable();
        c5.addition();
        c5.subtraction();
        c5.multiplication();
        c5.division();
    }
}
