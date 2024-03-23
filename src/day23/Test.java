package day23;

public class Test
{
    public static void main(String[] args) {
        System.out.println("========================CAR OBJECT==============");
        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

        System.out.println("========================BMW OBJECT==============");
        BMW bmw = new BMW();
        bmw.start();
        bmw.autoParking();
        bmw.stop();
        bmw.refuel();

        System.out.println("===================TOP/UP CASTING USING CAR CLASS==================");
        Car car=new BMW();
        car.start();
        car.stop();
        car.refuel();

        System.out.println("===================TOP/UP CASTING USING VEHICLE CLASS==================");

        Vehicle vehicle= new BMW();
        vehicle.electricFuel();
        System.out.println("*****************************************8");
       Vehicle vcl = new Car();
       vcl.electricFuel();
       vcl.stop(); // Car stop
        System.out.println("*****************************************8");
        System.out.println("===================DOWN CASTING USING CAR CLASS==================");

        //BMW bmw1 = (BMW)new Car(); //Down casting not allowed in java
        //BMW bmw2= new Vehicle(); Down casting not allowed in java
        //Car car2= new Vehicle(); Down casting not allowed in java

        Car car2 = new Car();
        car2.start();
        car2.refuel();
        car2.electricFuel();
        Car.stop();

        Vehicle vhh = new Car();
        vhh.testingFinalInheritance();

    }
}
