package day20;

public class ExecutingUser
{
    public static void main(String[] args) {
        User u1 = new User("Jason", 21, "jason@janbask.com", "test@1234", 232131);
        System.out.println(u1.name); //Jason
        System.out.println(u1.age);//21
        System.out.println(u1.emailId);//jason@janbask.com
        System.out.println(u1.password);//test@1234
        System.out.println(u1.phone);//232131

        System.out.println("============================================");
        User u2 = new User("Kerrie", 19, "Kerrie@janbask.com", "test@12334");
        System.out.println(u2.name); //Jason
        System.out.println(u2.age);//21
        System.out.println(u2.emailId);//jason@janbask.com
        System.out.println(u2.password);//test@1234
        System.out.println(u2.phone);//0

        System.out.println("============================================");
        User u3 = new User("Tom", 52, 5464564);
        System.out.println(u2.name); //Tom
        System.out.println(u2.age);//52
        System.out.println(u2.emailId);//null
        System.out.println(u2.password);//null
        System.out.println(u2.phone);//5464564
    }
}
