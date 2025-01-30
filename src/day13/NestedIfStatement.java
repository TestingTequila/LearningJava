package day13;

public class NestedIfStatement
{
    public static void main(String[] args) {

        int age = 25;
        boolean hasVoterIdCard = true;
        boolean taxBenefit = true;
        if(age>=18)
        {
            System.out.println("He is eligible to Vote");
            if(hasVoterIdCard)
            {
                System.out.println("Send him to Voting Room...");
                if (taxBenefit)
                {
                    System.out.println("He can avail Tax Benefit");
                }
            }
        }
    }
}
