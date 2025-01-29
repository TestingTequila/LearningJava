package day12;

public class MultipleIfStatement
{
    public static void main(String[] args) {
        int marks =75;
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
        if(marks<60)
        {
            System.out.println("Student has not cleared the exam");
        }
    }
}
