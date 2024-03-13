package day16;

public class SeleniumExample
{
    public  String launchBrowser(String browserName)
    {
        String browser=null ;

        if(browserName.equals("Chrome"))
        {
            browser= "Chrome Browser";
        }
        else if (browserName.equals("IE"))
        {
            browser= "Internet Explorer Browser";
        }
        else if (browserName.equals("Firefox"))
        {
            browser=  "Mozilla Firefox Browser";
        }
        else if (browserName.equals("Edge"))
        {
            browser= "Edge";
        }
        return browser;
    }

    public  String myName()
    {
        return "Ashish";
    }
}
