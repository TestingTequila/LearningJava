package day12;

public class WhileLoopsConcepts
{
    public static void main(String[] args) {

        // I want to print "Hello World" 10 times
        int i =1;
        while (i<=100)
        {
            System.out.println("Hello World");
            i++;
        }

        // I want to print the number from 1-10;

        int num =1;
        while (num<=100)
        {
            System.out.println(num);
            num++;
        }


        // I want to print the numbers from 10-1;

        int x =10;
        while (x>0)
        {
            System.out.println(x);//10, 9, 8, 7, 6.......1
            x--;
        }

        //Welcome to Hilton Hotel

//        while(true)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }


        //I want to print table of 2;
        System.out.println("====================TABLE OF 2====================");
        int j = 1;
        while (j<=10)
        {
            System.out.println(5*j);//2, 4, 6, 8, 10, 12, 14, 16, 18, 20
            j++;//11
        }


        // I want to print "Hello World" 10 times
        int i1 =1;
        while (i1<=100)
        {
            if(i1==50)
            {
                System.out.println("This is my World");
                break;
            }
            System.out.println("Hello World");
            i1++;
        }

        // I want to print "Hello World" 10 times
        int i2 =1;
        while (i2<=100)
        {
            if(i2%5==0)
            {
                System.out.println(i2 + " : is divisible by 5");
            }
            System.out.println( "Hello World ");
            i2++;
        }

        String sentence = "pre-recorded";
         while(sentence.equals("pre-recorded"))
         {
             // keep scrolling the page
             break;
         }
    }
}
