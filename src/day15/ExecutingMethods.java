package day15;

public class ExecutingMethods
{
    public static void main(String[] args) {
        MethodsConcepts mc = new MethodsConcepts();
        mc.a =12;
        mc.b =8;
        mc.addition();
        mc.subtraction();
        mc.addition1(122,8);
        mc.subtraction(122,2);
        mc.addition3(); //20

        MethodsConcepts mc1 = new MethodsConcepts();
        mc.a=100;
        mc.b=50;
        mc.addition(); //150
        mc.subtraction(); //50
        mc.addition1(20, 30); //50
        mc.subtraction(20, 5); //15
        mc.addition3(); //20

        PrintEmployeeDetails ped = new PrintEmployeeDetails();

        ped.empFullName("Kerrie", " Wright"); // Kerrie Wright
        System.out.println(ped.fName + " and " + ped.lName); // null and null

        MethodsWithParameterAndWithoutReturnType mwpamwrt = new MethodsWithParameterAndWithoutReturnType();
        mwpamwrt.addition(12, 8);
        mwpamwrt.subtraction(14,56);

    }
}
