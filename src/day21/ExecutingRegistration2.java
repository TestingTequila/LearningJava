package day21;

public class ExecutingRegistration2 {
    public static void main(String[] args) {
        Registration2 reg = new Registration2("Jason", "Clinton", 45, "New York", false);
        System.out.println(reg.getfName());
        System.out.println(reg.getlName());
        System.out.println(reg.getAge());
        System.out.println(reg.getCity());
        System.out.println(reg.isMarried());

        System.out.println("===========================================");

        reg.setfName("Kerrie");
        reg.setlName("Wright");
        reg.setAge(23);
        reg.setCity("London");
        reg.setMarried(true);
        System.out.println(reg.getfName());
        System.out.println(reg.getlName());
        System.out.println(reg.getAge());
        System.out.println(reg.getCity());
        System.out.println(reg.isMarried());


    }
}
