package day18;

public class ExecutingBrowser
{
    public static void main(String[] args) {
        BrowserLaunch bl = new BrowserLaunch();
        String browserType=bl.launchBrowser("Safari");
        System.out.println(browserType);
    }
}
