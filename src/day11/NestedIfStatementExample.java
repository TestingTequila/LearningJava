package day11;

public class NestedIfStatementExample {

    public static void main(String[] args) {
        int age =20;
        boolean hasTickets=true;
        boolean hasMoney=true;

        if(age>=18)
        {
            System.out.println("To are eligible to enter the venue");
            if(hasTickets)
            {
                System.out.println("Ticked Checked, You may proceed");
                if(hasMoney)
                {
                    System.out.println("Can buy some Drink....");
                }
            }
        }
    }
}
