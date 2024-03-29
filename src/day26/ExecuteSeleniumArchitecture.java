package day26;

public class ExecuteSeleniumArchitecture
{
    public static void main(String[] args) {

        //1. Open the Browser
        //ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver = new FirefoxDriver();
//        SafariDriver driver = new SafariDriver();


        WebDriver driver= null;

        if(ApplicationValues.BROWSER_TYPE.equals("Chrome"))
        {
            driver=new ChromeDriver();
        }
        else if(ApplicationValues.BROWSER_TYPE.equals("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (ApplicationValues.BROWSER_TYPE.equals("Safari"))
        {
            driver= new SafariDriver();
        }

        else if (ApplicationValues.BROWSER_TYPE.equals("Edge"))
        {
            driver= new EdgeDriver();
        }
        else
        {
            System.out.println("Please enter a valid browserType");
        }

        //2. Enter the url
        driver.get("https://janbaskdemo.com/");
        //3. Enter EmailId
        driver.sendKeys("EMAIL TEXT BOX", "jason.roger@gmail.com");
        //4. Enter the password
        driver.sendKeys("PASSWORD TEXT BOX", "test@1234");
        //5. Click on Button
        driver.click(" Login Button");
        //6. Capture the Title
        String title=driver.getTitle();
        System.out.println("TITLE OF PAGE:" + title);
        //7. Close the Browser
        driver.close();

    }
}
