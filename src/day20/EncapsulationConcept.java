package day20;

public class EncapsulationConcept {

    private  String name; // null
    private int salary; // null

    public  void setName(String name)
    {
        if(name.equals("Jason"))
        {
            System.out.println( name +" not an employee of this company");
        }
        else
        {
            this.name = name;
        }
    }

    public  void setSalary(int salary)
    {
        if(salary>6000 && salary <=10000)
        {
            this.salary =salary;
        }

        else
        {
            System.out.println(" Invalid Salary....Please check the amount");
        }

    }

    public  String getName()
    {
        return name; //null
    }

    public int getSalary()
    {
        return salary; // 5000
    }

//    Encapsulation in Java refers to integrating (variables) and  (methods) into a single unit.
//    In encapsulation, a class's variables are hidden from other classes and can only be accessed by the methods
//    of the class in which they are found
}
