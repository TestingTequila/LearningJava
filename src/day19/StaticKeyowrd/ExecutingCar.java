package day19.StaticKeyowrd;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name ="BMW";
        c1.color="Red";
        c1.price=8000;

//        c1.wheels=4;

        Car c2 = new Car();
        c2.name="Audi";
        c2.color="Black";
        c2.price=5678;
//        c2.wheels=4;

        Car c3 = new Car();
        c3.name ="Honda";
        c3.color ="Blue";
        c3.price =4567;
//        c3.wheels=4;

        System.out.println(c1.name+ ", " + c1.color + ", " + c1.price + ", " + Car.wheels);
        System.out.println(c2.name+ ", " + c2.color + ", " + c2.price + ", " + Car.wheels);
        System.out.println(c3.name+ ", " + c3.color + ", " + c3.price + ", " + Car.wheels);
        c1.start();
        c2.start();
        c3.start();

        Car.speedTest();

    }
}
