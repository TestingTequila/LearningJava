package day13;

public class SwitchStatement
{
    public static void main(String[] args) {
        int marks =65;
        switch (marks)
        {
            case 90:
                System.out.println("Student has got grade A");
                break;
            case 85:
                System.out.println("Student has got grade B");
                break;
            case 75:
                System.out.println("Student has got grade C");
                break;
            case 65:
                System.out.println("Student has got grade D");
                //break;
            default:
                System.out.println("Student has failed...");
            case 50:
                System.out.println("Student has got grade D");
                break;
        }
    }
}
