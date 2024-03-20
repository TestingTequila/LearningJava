package day20;

public class Browser
{
    public void launchBrowser()
    {
        checkRAM();
        checkOS();
        checkVERSION();
        checkBrowserServices();
        System.out.println(" Chrome browser is launched.....");
    }

    private  static void checkRAM()
    {
        System.out.println("Check RAM");
    }
    private   void checkVERSION()
    {
        System.out.println("Check Version");
    }

    private void checkOS()
    {
        System.out.println("Check OS");
    }

    private   void checkBrowserServices()
    {
        System.out.println("check Browser Services");
    }


}
