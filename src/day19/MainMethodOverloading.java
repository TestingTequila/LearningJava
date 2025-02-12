package day19;

public class MainMethodOverloading {
     String myName; //Ns
    public static void main(String[] args) {
        main("Jason");
        main("Jason, 18");
        MainMethodOverloading.main("Tony");
        MainMethodOverloading mmo= new MainMethodOverloading();
        mmo.myName="Arshi";
    }

    public static void main(String[] args, String[] arg) {

    }

    public static void main(String args) {
        System.out.println("Test");
    }

    public static void main(String args, int a) {

    }
}

//main method can be overloaded

//ns ==> create object and call
//s  ==> Directly Call through className
