package day11;

public class MathOperations {
    public static void main(String[] args) {
        //1*. I/I =I
        int a = 10;
        int b = 2;
        int c = 3;
        int d =0;
        double sum = a/c; //3.0
        System.out.println(sum); //3
        System.out.println(a / b);//5
        System.out.println(a / c);//3


        //2*. D/I; I/D; D/D =D
        double d1 = 2.0;
        double d2 = 3.0;
        System.out.println(a/d1);// 10/2.0= 5.0
        System.out.println(a/d2);//10/3.0 = 3.333
        System.out.println(3.0/2.0);//1.5

        //3. I/0 =
        //System.out.println(a/d); //10/0 = AE;

        //4. D/0 =
        System.out.println(d1/0); // infinity

        //5. 0/0, 0.0/0, 0.0/0.0
        int w =0;
        int j =0;
        double k =0.0;
        double h =0.0;
//        System.out.println(w/j) ; //0/0 : AE
//        System.out.println(k/j) ; //0.0/0 : NaN
//        System.out.println(k/h); //0.0/0.0 : NaN
        System.out.println(0.1/0.1);

        //6*. Modulo Operator
        System.out.println(a%b); //17%3 = 2
        System.out.println(17%3); //Remainder
        System.out.println(17.0%3); //2.0
        float f1 =5.2f % 5.0f;
        System.out.println(f1);





    }
}
