package day29;

public class StringImmutability
{
    public static void main(String[] args) {
        String s = "Selenium";
        System.out.println(s+ " Automation");
        System.out.println(s); // Selenium

        String s1 = "  Ashish";
        System.out.println(s1); //  Ashish
        s1.trim();//Ashish
        System.out.println(s1); //  Ashish

        String ss = "Janbask";
        ss.concat("QA Training");
        System.out.println(ss); // Janbask
    }
}
