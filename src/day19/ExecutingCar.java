package day19;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car("Merc", "Red", 67000, true);
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(c1.isAutomatic);

        Car c2 = new Car("AlphaRomeo", "Blue");

        System.out.println(c2.name); //AlphaRomeo
        System.out.println(c2.color); // Blue
        System.out.println(c2.price); // 0
        System.out.println(c2.isAutomatic); //false

    }
}
