package day16;

import java.util.Arrays;

public class ExecutingPrintName
{
    public static void main(String[] args) {
        PrintIDCard pic = new PrintIDCard();
        String firstName=pic.printName("Ashish", "Mishra");
        System.out.println("Name on ID Card:" + (firstName + " MEDMA"));

        String fName=pic.printName("Jason", "Roger");
        System.out.println("Name on ID card " + (fName + " MEDMA"));

        Employee emp = new Employee();
        String[] myDevices=emp.getEmployeeDevices("Jason");

        for (int i=0;i<myDevices.length;i++)
        {
            System.out.println(myDevices[i]);

        }

    }
}
