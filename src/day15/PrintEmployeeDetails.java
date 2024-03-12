package day15;

public class PrintEmployeeDetails {

    String fName;
    String lName;
    public void empFullName(String fName,String lName)
    {
         this.fName = fName;
         this.lName = lName;
         String fullName = fName + lName;
        System.out.println("Full Name of the Employee is :" + fullName);
    }


}
