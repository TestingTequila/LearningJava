package day16;

public class ExecutingResume {
    public static void main(String[] args) {
        Resume a = new Resume();
        a.firstName = "Tek";
        a.lastName = "Chand";
        a.age = 38;
        a.isMarried = false;
        a.mobileNumber = 4354353;
        a.jobProfile = "QA";

        System.out.println(a.firstName + " " + a.lastName + " " + a.age + " " + a.isMarried + " " + a.mobileNumber + " " + a.jobProfile);

        Resume b = new Resume();
        b.firstName = "Jason";
        b.lastName = "Hill";
        b.age = 26;
        b.isMarried = true;
        b.mobileNumber = 98765;
        b.jobProfile = "Developer";
        System.out.println(b.firstName + " " + b.lastName + " " + b.age + " " + b.isMarried + " " + b.mobileNumber + " " + b.jobProfile);

        b = null;
        System.out.println(b.firstName); //NPE

        new Resume().firstName="Kerrie";
        new Resume().lastName= "Wright";
        new Resume().age=23;
        System.gc();



    }
}
