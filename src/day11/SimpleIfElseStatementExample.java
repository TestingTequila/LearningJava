package day11;

public class SimpleIfElseStatementExample
{
    // if Statement
    // Example 1

    public static void main(String[] args) {
        int age =16;
        if(age>=18)
        {
            System.out.println("You are eligible to Vote");
        }
        else
        {
            System.out.println("You are below 18, not eligible to vote");
        }

        int number = -10;
        if(number>0)
        {
            System.out.println("The Number is Positive");
        }
        else
        {
            System.out.println("The number is negative");
        }
    }
}
