package day19;

public class Car
{
    String name;
    String color;
    int price;
    boolean isAutomatic;

    public Car(String name, String color, int price, boolean isAutomatic)
    {
        this.name = name;
        this.color =color;
        this.price =price;
        this.isAutomatic= isAutomatic;
    }

    public Car(String name, String color)
    {
        this.name = name;
        this.color =color;
    }


}
