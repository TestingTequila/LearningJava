package day21;

public class ExecutingRegistration {
    public static void main(String[] args) {
        Registration reg = new Registration("Jason", "Clinton", 45, "New York", false);
        System.out.println(reg.getfName());
        System.out.println(reg.getlName());
        System.out.println(reg.getAge());
        System.out.println(reg.getCity());
        System.out.println(reg.isMarried());


    }
}
