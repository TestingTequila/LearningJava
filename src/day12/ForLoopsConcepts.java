package day12;

public class ForLoopsConcepts
{
    public static void main(String[] args) {

        // I want to print "Hello World" 10 times

        System.out.println("======================Hello World============================");

        for (int i =1;i<=10; i++)
        {
            System.out.println("Hello World");
        }

        // I want to print the number from 1-10;


        System.out.println("======================1 to 100============================");
        for (int num =1;num<=100;num++)
        {
            System.out.println(num);
        }

        System.out.println("======================10 to 1============================");

        // I want to print the numbers from 10-1;

        for (int x =10;x>0;x--)
        {
            System.out.println(x);//10, 9, 8, 7, 6.......1
        }


        //I want to print table of 2;
        System.out.println("====================TABLE OF 5====================");

        for (int j = 1;j<=10;j++)
        {
            System.out.println(5*j);//2, 4, 6, 8, 10, 12, 14, 16, 18, 20
        }

        System.out.println("====================THIS IS MY WORLD ====================");
        // I want to print "Hello World" 10 times and This is my World when Hello world is printed 50th time

        for (int i1 =1;i1<=100; i1++)
        {
            if(i1==50)
            {
                System.out.println("This is my World");
                break;
            }
            System.out.println("Hello World");

        }

//        // I want to print "Hello World" 10 times
//        int i2 =1;
//        while (i2<=100)
//        {
//            if(i2%5==0)
//            {
//                System.out.println(i2 + " : is divisible by 5");
//            }
//            System.out.println( "Hello World ");
//            i2++;
//        }


        //Welcome to Hilton Hotel

//        for(;true;)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }


        // a -z
        char c ='a';
        while(c<='z')
        {
            System.out.println((int)c + ":" + c);
            c++;
        }
    }
}
