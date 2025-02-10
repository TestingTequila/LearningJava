package day18;

public class EmployeeIdGeneration
{
    String fName;
    public  String empFullName(String fName, String lName)
    {
        String fullName=fName + lName;
        return fName;
    }

    public String finalNameOnIdCard()
    {
        String companyName = "MEDMA";
        String finalNameOnCard=fName + companyName;
        return finalNameOnCard;
    }
}


//emp full name --> fname, lName