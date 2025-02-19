package day24;

public class Test {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start(); // Car Starting
//        car.stop();
//        car.refuel();
//
        BMW bmw = new BMW();
        bmw.start(); //Overridden
        bmw.stop();  //Inherited
        bmw.refuel(); //Inherited
        bmw.autoParking(); //Self Method
        bmw.autoStart();

        Car car = new BMW(); //Top Casting, Upcasting
        car.start(); //BMW starting
        car.stop();
        car.refuel();
        car.billing();
        car.engine(); //BMW engine

        Vehicle vehicle= new Car();
        vehicle.engine(); //CAr engine

        //BMW bmw= (BMW)new Car(); //Down Casting

        Vehicle v= new BMW();
        v.autoStart();


    }
}


//1. overriding can happen between parent and child class
//2. static method can be inherited but not overridden
//2a.same static method can exist in p-c relationship And they are completely different methods - Method hiding
//3. final method cannot be inherited
//4. final + static cannot be inherited
//5. Top casting/Upcasting is possible between p-c relationship
//6. Down casting is not possible