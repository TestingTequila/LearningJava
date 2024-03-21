package day21;

public class User
{
     String name;

     public  User(String name) // Peter
     {
         this.name= name;
         System.out.println("SINGLE PARAMETER CONSTRUCTOR " + name); //1. SINGLE PARAMETER CONSTRUCTOR  Peter
     }

    public  User(String name, int age) // Peter, 42
    {

        this(name);
        this.name= name;
        System.out.println("DOUBLE PARAMETER CONSTRUCTOR " + name); //2. DOUBLE PARAMETER CONSTRUCTOR  Peter
    }

    public  User(String name, int age, String city) // John, 32, London
    {
        this("Peter", 42);
        this.name= name;
        System.out.println("TRIPLE PARAMETER CONSTRUCTOR " + name); //2. DOUBLE PARAMETER CONSTRUCTOR  John
    }

     public  void myName(String name)
     {
         this.name = name;
         this.yourName("Jason");
     }

    public  void yourName(String name)
    {
        this.name = name;
        this.myName("Kerrie");
    }

}
