package day09;

public class VariableConcepts2 {
    public static void main(String[] args) {
        // char
        char c1 = 'a'; //97
        char c11 = 'b';//98
        System.out.println(c1+c11); //97+98 = 195

        char c2 = '1'; //49
        char c22 ='9'; //57
        System.out.println((int)c2);
//        System.out.println(c2+c22); //49+57 =106
        char c3= 'z';
        System.out.println((int)c3);

        System.out.println(c2+c3); //171
        System.out.println((int)c2+(int)c3); //171
        System.out.println(c1);//a
        System.out.println(c1+0); //97
        System.out.println(c1+'0'); //97+48 =145
        System.out.println(c1+"Ashish"+c11);//ab
        System.out.println(1+""+9); //19


        // boolean [true,false][~1 bit]
        boolean b1=true;
        System.out.println(b1);
        boolean b2=false;
        System.out.println(b2);

        byte x =100;




    }
}
