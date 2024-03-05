package day11;

public class SwitchExample
{
    public static void main(String[] args) {
        int dayOfWeek=31;

        switch (dayOfWeek)
        {
            case 1:
                System.out.println("Its Monday. ");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            default:
                System.out.println("Invalid day of the week provided");
                break;
        }
    }
}
