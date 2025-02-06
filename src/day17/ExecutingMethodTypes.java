package day17;

public class ExecutingMethodTypes
{
    public static void main(String[] args) {

        MethodWithParameterAndNoReturnType m1 = new MethodWithParameterAndNoReturnType();
        //m1.x=12;
        //m1.y=8;
        m1.addition(12, 8);
        m1.subtraction(10, 7);
        m1.multiplication(4,5);

        m1.glbVar1=120;
        m1.glbVar2=133;
        m1.addition(12,56);
        m1.division();
    }
}
