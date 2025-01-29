package day12;

public class PrePostIncrementDecrementInPrint
{
    public static void main(String[] args) {

//        int x =10;
//        System.out.println(--x);
//        System.out.println(x);

//        char g = '1';
//        System.out.println(++g);
//        System.out.println(g);

//        char g = 'z';
//        System.out.println(++g);
//        System.out.println(g);

        int m = 200;
        int n = m++;
        System.out.println(--m);//200
        System.out.println(m);//200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199

    }
}
