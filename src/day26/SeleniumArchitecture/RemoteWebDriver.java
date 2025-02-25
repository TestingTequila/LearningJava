package day26.SeleniumArchitecture;

import java.util.Arrays;

public class RemoteWebDriver implements WebDriver {

    @Override
    public void findElement(String element) {
        System.out.println("findElement: " + element);
    }

    @Override
    public void findElements(String[] elements) {
        System.out.println("findElements: " + Arrays.toString(elements));
    }

    @Override
    public void get(String url) {
        System.out.println("url: " + url);
    }

    @Override
    public void getTitle(String pageTitle) {
        System.out.println("pageTitle: " + pageTitle);
    }

    @Override
    public void click(String webElement) {
        System.out.println("webElement: " + webElement);
    }
}
