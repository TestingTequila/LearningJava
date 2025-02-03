package day15;

public class ArraysUsingForLoop {
    public static void main(String[] args) {

        System.out.println("====Numbers Array======================");
        int[] numbers = {12, 24, 35, 46, 67, 33, 11, 22, 44, 55, 66, 67, 77, 88, 99, 91, 87, 62, 98, 76};

        for (int i = 0;i < numbers.length;i++) {
            System.out.println(numbers[i]);

        }

        System.out.println("====Decimal Numbers Array======================");
        double[] dn = {12.34, 45.6, 76.23, 67.8, 78.9};

        for (int j = 0;j < dn.length;j++) {
            System.out.println(dn[j]);

        }

        System.out.println("====String Array======================");
        String[] friends = {"Tek Chand", "Ashish", "Jason", "Justin", "Kerrie"};
        //1. while loop


        for (int x = 0;x < friends.length;x++) {
            if(!(friends[x].equals("Jason"))) {
                System.out.println(friends[x]);
            }

        }


    }
}
