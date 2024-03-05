package day11;

public class MultipleIfWithOneElseStatement {
    public static void main(String[] args) {

        int score = 55;
        if (score >= 90) {
            System.out.println("Excellent! You got a grade A");
        }
        if (score < 90 && score >= 80) {
            System.out.println(" Very Good! You got a grade B");
        }
        if (score < 80 && score >= 70) {
            System.out.println("Good! You got a grade C");
        }
        if (score < 70 && score >= 60) {
            System.out.println("Fair! You got a grade D");
        }
        else
        {
            System.out.println("You got less than 60, Your grade is F");
        }
    }
}
