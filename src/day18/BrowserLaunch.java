package day18;

public class BrowserLaunch
{
    public String launchBrowser(String browserName)
    {
        String browserType=null;
        if(browserName.equals("Chrome"))
        {
            browserType= "Launch Chrome Browser";
        }
        else if(browserName.equals("Firefox"))
        {
            browserType= "Launch Firefox Browser";
        }
        else if(browserName.equals("Edge"))
        {
            browserType= "Launch Edge Browser";
        }
        else if(browserName.equals("Safari"))
        {
            browserType= "Launch Safari Browser";
        }
        return browserType;
    }
}
