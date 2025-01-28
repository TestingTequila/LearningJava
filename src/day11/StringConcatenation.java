package day11;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Tek";
        String y = "Chand";

        int a=100;
        int b =200;

        double d1 =12.44;
        double d2= 44.56;

        System.out.println(x);// Tek
        System.out.println(y);// Chandra
        System.out.println(x + y);//TekChandra
        System.out.println(a);//100
        System.out.println(b);//200
        System.out.println(a+b);//300
        System.out.println(x+a);//Tek100
        System.out.println(a+b+x);//300Tek
        System.out.println(a+x+b+y); //100Tek200Chand
        System.out.println(x+y+a+b);//TekChand100200
        System.out.println(a+b+x+y); //300TekChand
        System.out.println(a+b+x+y+a+b); //300TekChand100200
        System.out.println(a+b+x+y+(a+b));//300TekChand300
        System.out.println(d1+d2); // 12.44 + 44.56
        System.out.println(x+y+d1+d2+a+b+x+y); //TekChand12.4444.56100200TekChand
        System.out.println(x+y+d1+d2+(a+b)+d1+d2); //Tek+Chand12.4444.5630012.4444.56
    }


}
