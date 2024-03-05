package day11;

public class SwitchORExample {
    public static void main(String[] args) {
        String day = "Friday";
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Its Weekday, I will go to office");
                break;
            case "Saturday":
            case "Sunday":
            System.out.println("Its Weekend, I will Party");
            break;

        }
    }
}
