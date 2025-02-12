package day19.StaticKeyowrd;

public class ExecutingCar2
{
    public static void main(String[] args) {

        Car.engineTest();
        Car.speedTest();
        Car c1 = new Car();
        c1.start();
        c1.stop();

    }
}

//If global variable/method is non-static, we can call it only by creating its object
//If global variable/method is static, we can call them using className directly