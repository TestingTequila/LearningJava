package day26.SeleniumArchitecture;

public class Test {
    public static void main(String[] args) {

        WebDriver driver = null;
        String BrowserType = "Chrome";
        if (BrowserType.equals("Chrome"))
        {
             driver = new ChromeDriver();
        } else if (BrowserType.equals("Edge"))
        {
            driver = new EdgeDriver();
        }


    }
}
