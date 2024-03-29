package day26;

public interface WebDriver extends SearchContext
{
    @Override
    public void findElement(String element);
    @Override
    public void findElements(String element, int count);

    public void get(String url);
    public String getTitle();

    public void click(String element);

    public void sendKeys(String element, String text);

    public void close();
}
