package day20;

public class ExecutingEncapsulation {
    public static void main(String[] args) {
        EncapsulationConcept ec = new EncapsulationConcept();
          ec.setName("Jason");
          ec.setSalary(8000);
        System.out.println("Pay " + ec.getName() + " a salary of $" + ec.getSalary() );

    }
}
