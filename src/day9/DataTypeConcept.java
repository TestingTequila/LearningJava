package day9;

public class DataTypeConcept {
    public static void main(String[] args) {

        //10, 15
        byte x = 120;
        byte y = 100;
        int sum = x + y;
        //Byte, short data type are not meant for mathematical calculations
//        System.out.println(x);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);

//        byte b= 12;
//        int  i =100;
//        int total =b+i;
//
//        float f1 =12.123456789f; // 4 byte [up to 6-7 decimal places]
//        System.out.println(f1);
//        float f2 =(float) 77.76;
//
//        double d1 =12.1234567899876543; // 8 byte [up to 16 digits after decimal]
//        System.out.println(d1);

        //char = 2 byte =16 bits [0-9, a-z, A-Z, !@#$%^&*()_+]
//        char c1 = 'a';
//        char c11 = 'b';
//        System.out.println(c1); //a -97
//        System.out.println(c11);//b -98
//        System.out.println(c1 + c11); //a+b, ab ....?

        char c3 = '1';
        char c4 = '9';
//        System.out.println(c3);
//        System.out.println(c4);
//        System.out.println(c3+c4);
//
//        int i =12;
//        int total =i+c3;
//        System.out.println(total);

//        System.out.println((int) c3);
        char u1 = 'a'; //97
        char u2 = 'b'; //98
//        System.out.println((int)u1+(int)u2);
//        System.out.println(u1+0);
//        System.out.println(u1+'0');
//        System.out.println((int)u1+"0");

//        System.out.println((int)u1);
//        System.out.println((int)u2);
          char u11 = 'a';
        System.out.println((int)u11);//97

        int u22 = 97;
        System.out.println((char)u22);//a


//byte, short, int, long, float, double, char, boolean

     //boolean ~1bit // true, false
        boolean flag = false;
        System.out.println(flag);

    }
}
