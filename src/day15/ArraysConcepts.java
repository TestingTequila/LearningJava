package day15;

public class ArraysConcepts {
    public static void main(String[] args) {

        int y = 100;
//        System.out.println(y);

        //12,24,35,46,67
        int[] numbers = {12, 24, 35, 46, 67, 33, 11, 22, 44, 55, 66, 67, 77, 88, 99};
//        System.out.println(numbers[4]);
        System.out.println(numbers.length);

        //12.34, 45.6, 76.23,67.8, 78.9
        double[] dn = {12.34, 45.6, 76.23, 67.8, 78.9};
//        System.out.println(dn[3]);

        //Tek Chand, Ashish, Jason, Justin, Kerrie

        String[] friends = {"Tek Chand", "Ashish", "Jason", "Justin", "Kerrie"};
        System.out.println(friends[2]);
        System.out.println(friends.length);
    }
}
