package day13;

public class MultipleIfElseStatement
{
    public static void main(String[] args) {
        int marks =50;
        if(marks>=90)
        {
            System.out.println("Student has score grade A");
        }
        if(marks>=80 && marks<90)
        {
            System.out.println("Student has score grade B");
        }
        if(marks>=70 && marks<80)
        {
            System.out.println("Student has score grade C");
        }
        if(marks>=60 && marks<70)
        {
            System.out.println("Student has score grade D");
        }
        else
        {
            System.out.println("The student is not Selected as marks is below 60");
        }
    }
}
