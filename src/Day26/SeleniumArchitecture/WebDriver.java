package Day26.SeleniumArchitecture;

public interface WebDriver extends  SearchContext{

    @Override
    public void findElement(String element);

    @Override
    public void findElements(String[] elements);

    public void get(String url);

    public void getTitle(String pageTitle);

    public void click(String webElement);
}
