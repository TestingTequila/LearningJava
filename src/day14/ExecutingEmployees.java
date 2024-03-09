package day14;

public class ExecutingEmployees
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name ="Abdul";
        e1.age =25;
        e1.city ="Delhi";
        e1.salary =5000.34;

        Employee e2 = new Employee();

        Employee e3 =new Employee();
//        e3 =null;
//        e3.name = "Jason";
//        System.out.println(e3.name);

        e3 = new Employee();
        e3.name = "Jason";
        System.out.println(e3.name);

        // Objects without references - No Reference Object

        new Employee().name ="Kerrie";
        new Employee().age =23;
        new Employee().city ="NY";
        new Employee().salary =5000;
        System.gc();

    }
}
