package day17.StaticConcept;

public class ExecutingCar
{
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name="BMW";
        c1.price =90000;
        c1.color="Red";
        c1.start();
        Car.speedTest();
        System.out.println(Car.wheels);

        Car c2= new Car();
        c2.name ="Audi";
        c2.price=80000;
        c2.color ="White";
        Car.speedTest();
        c2.start();
        System.out.println(Car.wheels);

        Car c3 = new Car();
        c3.name ="Honda";
        c3.price= 50000;
        c3.color ="Black";
        Car.speedTest();
        c3.start();
        System.out.println(Car.wheels);


    }
}
