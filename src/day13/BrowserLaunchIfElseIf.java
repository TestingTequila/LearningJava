package day13;

public class BrowserLaunchIfElseIf
{
    public static void main(String[] args) {
        String browserName = "Edge";

        if(browserName=="Chrome")
        {
            System.out.println("Launch Chrome Browser");
        }
        else if (browserName=="Firefox")
        {
            System.out.println("Launch Firefox Browser");
        }
        else if (browserName=="IE")
        {
            System.out.println("Launch IE Browser");
        }

        else if (browserName=="Edge")
        {
            System.out.println("Launch Edge Browser");
        }

        else
        {
            System.out.println("Enter correct browser Name...");
        }
    }

}
