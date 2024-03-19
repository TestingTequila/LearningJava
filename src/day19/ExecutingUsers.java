package day19;

public class ExecutingUsers
{
    public static void main(String[] args) {
        User u1 = new User("Jason"); // Default Constructor
        System.out.println(u1.name); // Jason
        System.out.println(u1.age); // 0
        System.out.println(u1.email);// null
        System.out.println(u1.password); // null
        System.out.println(u1.phone); // null

        System.out.println("=================================================");

        User u2 = new User("Kerrie", 19);
        System.out.println(u2.name + " and " + u2.age);
        System.out.println(u2.email);// null
        System.out.println(u2.password); // null
        System.out.println(u2.phone); // null

        User u3 = new User("Lee", 45, "lee@janbask.com");
        System.out.println(u3.name + " and age" + u3.age + " and Email: " + u3.email);

        User u4 = new User("brian@janbask.com", "test@1234");
        System.out.println(u4.email + " and password: " + u4.password);

        System.out.println("*******************************************");
        User u5 = new User("John", 24, "john@janbask.com", "test@12345", "6787686");
        System.out.println(u5.name);
        System.out.println(u5.age);
        System.out.println(u5.email);
        System.out.println(u5.password);
        System.out.println(u5.phone);
    }

}
