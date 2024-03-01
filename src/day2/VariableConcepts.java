package day2;

public class VariableConcepts
{
    public static void main(String[] args)
    {
        //Variables: They are meant to store value.

        //1. dataType variableName=value;

        // a) byte [-128 to +127][1 byte=8 bits]
        // 1 byte = 8 bits
        byte num1=127;
        System.out.println(num1);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // b) short [-32768 to 32767][2 bytes =16 bits]
        short num2=32767;
        System.out.println(num2);
        short num3=100;

        int total =num1+num2; // byte & short

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // c) int [-2147483648 to 2147483647][4 bytes =32 bits]
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int num4 =100;

        int finalValue=num1+num4; // byte and Integer
        int total1 =num3+num4;    // int and short

        //========================================================================

        short x=32767;
        byte y=127;
        int sum =x+y;

        // d) long [-9223372036854775808 to 9223372036854775807][8 Byte = 64 bits]
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        long num5 =2147483648l;

        // Floating Values

        // float[ up to 7 digits][ 4 bytes = 32 bits]
        float f1=(float)12.33;

        // byte and float

        float total2=num1+ f1; // 10+12.22

        // int and float
        float sum1=num4 + f1;

        //double [up to 16 digits after decimal][ 8 byte = 64 bits]
        double d1=12.33333888;

       double decimalTotal= f1+d1;

       // char [a-z,A-Z, 1-9, !-+][2 Bytes =16 bits]
        char c1 ='a';
        System.out.println(c1); //a
        char c11= 'z';
        System.out.println(c11); //z
        char c2 = '1'; // 1-9
        System.out.println(c2);
        char c3 ='A'; // A-Z
        System.out.println(c3);
        char c4 = '$';
        System.out.println(c4);






    }
}
