package day26;

public class RemoteWebDriver implements WebDriver {
    @Override
    public void findElement(String element) {
        System.out.println("Finding Element " +element );
    }

    @Override
    public void findElements(String element, int count) {
        System.out.println("Finding Element " +element + " and count is " + count );
    }

    @Override
    public void get(String url) {
        System.out.println("Entering the url " + url);
    }

    @Override
    public String getTitle() {
        return "JanBask Login Page";
    }

    @Override
    public void click(String element) {
        System.out.println("Clicking on button:" + element);
    }

    @Override
    public void sendKeys(String element, String text) {
        System.out.println("Entering value in " + element + " and the value is :" + text);
    }

    @Override
    public void close() {
        System.out.println("Closing the page");
    }
}
