package day15;

public class ArraysUsingAdvancedForLoop {
    public static void main(String[] args) {

        System.out.println("====Numbers Array======================");
        int[] numbers = {12, 24, 35, 46, 67, 33, 11, 22, 44, 55, 66, 67, 77, 88, 99, 91, 87, 62, 98, 76};
        for(int n :numbers)
        {
            System.out.println(n);
        }

        System.out.println("====Decimal Numbers Array======================");
        double[] dn = {12.34, 45.6, 76.23, 67.8, 78.9};
        for(double d :dn)
        {
            System.out.println(d);
        }


        System.out.println("====String Array======================");
        String[] friends = {"Tek Chand", "Ashish", "Jason", "Justin", "Kerrie"};
        for(String f: friends)
        {
            if(!(f.equals("Jason"))) {
                System.out.println(f);
            }
        }


    }
}
