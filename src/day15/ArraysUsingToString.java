package day15;

import java.util.Arrays;

public class ArraysUsingToString {
    public static void main(String[] args) {

        System.out.println("====Numbers Array======================");
        int[] numbers = {12, 24, 35, 46, 67, 33, 11, 22, 44, 55, 66, 67, 77, 88, 99, 91, 87, 62, 98, 76};
        System.out.println(Arrays.toString(numbers));

        System.out.println("====Decimal Numbers Array======================");
        double[] dn = {12.34, 45.6, 76.23, 67.8, 78.9};
        System.out.println(Arrays.toString(dn));


        System.out.println("====String Array======================");
        String[] friends = {"Tek Chand", "Ashish", "Jason", "Justin", "Kerrie"};
        System.out.println(Arrays.toString(friends));




    }
}
