package day3;

public class MathematicalOperations
{
    public static void main(String[] args) {
        //1. I/I =I
        System.out.println(10/2); //5
        int a =9;
        int b=2;
        System.out.println(9/2); //4
        System.out.println(10/3); //3

        //2. Decimal in numerator/DenominatorOrBoth= Decimal
        System.out.println(9.0/2);//4.5
        System.out.println(9/2.0);//4.5
        System.out.println(9.0/2.0);//4.5

        //3. I/0 = AE
        //System.out.println(9/0); //AE

        //   I/0.0 =Infinity
        System.out.println(9/0.0); // Infinity

        //   D/0.0 =Infinity
        System.out.println(9.0/0.0); // Infinity

        // if N or D both have 0 only and any one of them is 0.0 =NaN
        System.out.println(0/0.0); //NaN
        System.out.println(0.0/0.0); //NaN
        System.out.println(0.0/0); //NaN
        //System.out.println(0/0); //AE

        //Modulo Operator [%]
        System.out.println(10%2); //0
        System.out.println(10%3);// 1
        System.out.println(9.2%2); //1.1999999999999993

        //I/D operators
    }
}
