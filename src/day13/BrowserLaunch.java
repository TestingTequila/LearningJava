package day13;

public class BrowserLaunch
{
    public static void main(String[] args) {
        String browserName = "Edge";

        switch (browserName)
        {
            case "Chrome":
                System.out.println("Launch Chrome Browser");
                break;
            case "Firefox":
                System.out.println("Launch Firefox Browser");
                break;
            case "InternetExplorer":
                System.out.println("Launch IE Browser");
                break;
            case "Edge":
                System.out.println("Launch Edge Browser");
                break;
            case "Safari":
                System.out.println("Launch Safari Browser");
                break;
            default:
                System.out.println("Incorrect Browser Name");
                break;
        }
    }

}
