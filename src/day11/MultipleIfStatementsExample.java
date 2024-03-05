package day11;

import java.net.Socket;

public class MultipleIfStatementsExample
{
    public static void main(String[] args) {

        int score =95;
        if(score>=90)
        {
            System.out.println("Excellent! You got a grade A");
        }
        if(score<90 && score>=80)
        {
            System.out.println(" Very Good! You got a grade B");
        }
        if(score<80 && score>=70)
        {
            System.out.println("Good! You got a grade C");
        }
        if(score<70 && score>=60)
        {
            System.out.println("Fair! You got a grade D");
        }
        if(score<60)
        {
            System.out.println("Sorry, You Failed. You got a grade F");
        }


        String day = "Monday";
        if(day=="Monday")
        {
            System.out.println("I need to go to office");
        }
        if(day=="Tuesday")
        {
            System.out.println("I need to pick the AC");
        }
        if(day=="Wednesday")
        {
            System.out.println("I need to visit my grand parents");
        }

        if(day=="Thursday")
        {
            System.out.println("I need to visit my Friends");
        }

        if(day=="Friday")
        {
            System.out.println("I need to watch some movie");
        }

    }
}
