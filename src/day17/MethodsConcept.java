package day17;

public class MethodsConcept {

    int x; //12
    int y;//8
    public void addition()
    {
        int sum =x+y;
        System.out.println(sum);
    }

    // to print the full name of a person
    String firstName;
    String lastName;
    public void fullName()
    {
      String myName = firstName +" "+ lastName;
        System.out.println(myName);
    }

    // WAP to display the marks of student

    String studentName;
     public void  displayName()
    {
        if(studentName.equals("Jason"))
        {
            System.out.println(100 + " Marks");
        }
        else if (studentName.equals("Kirti"))
        {
            System.out.println(85 + " Marks");
        }

        else if (studentName.equals("Ashish"))
        {
            System.out.println(92 + " Marks");
        }

        else if (studentName.equals("Tek Chand"))
        {
            System.out.println(98 + " Marks");
        }
        else
        {
            System.out.println("Please enter correct name of student");
        }
    }

    public  void calculateTax()
    {
        double tax = 0.3;
    }
}
