package day15;

public class ArraysUsingWhileLoop {
    public static void main(String[] args) {

        System.out.println("====Numbers Array======================");
        int[] numbers = {12, 24, 35, 46, 67, 33, 11, 22, 44, 55, 66, 67, 77, 88, 99, 91, 87, 62, 98, 76};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("====Decimal Numbers Array======================");
        double[] dn = {12.34, 45.6, 76.23, 67.8, 78.9};
        int j = 0;
        while (j < dn.length) {
            System.out.println(dn[j]);
            j++;
        }

        System.out.println("====String Array======================");
        String[] friends = {"Tek Chand", "Ashish", "Jason", "Justin", "Kerrie"};
        //1. while loop

        int x = 0;
        while (x < friends.length) {
            if(!(friends[x].equals("Jason")))
            {
                System.out.println(friends[x]);
            }
            x++;
        }


    }
}
