package day22;

public class ExecutingApplication
{
    public static void main(String[] args) {
        EcomApplication eca = new EcomApplication("Justin", 34, true);
        System.out.println(eca.name);
        System.out.println(eca.age);
        System.out.println(eca.isMarried);
        eca.setlName("Roger");
        System.out.println(eca.getlName()); //Roger

    }
}


//1. this keyword is used to differentiate between global variable and parameters with the same name.
