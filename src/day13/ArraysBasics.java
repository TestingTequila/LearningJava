package day13;

import java.util.Arrays;

public class ArraysBasics
{
    public static void main(String[] args) {
        // 12, 34, 56, 78, 90

        // dataType[] arrayName    = {value1, value2, value3...........ValueN};
         byte[] numbers = {12, 34, 56, 78, 90, 100, 87, 65, 43, 65, 99, 88, 77, 66, 55, 44, 33, 22, 11,10, 20, 20, 30};
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));

        System.out.println("==================While loop===========================");
        int i=0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("===========================Advanced for loop/ for each loop===================");
        for(byte n : numbers)
        {
            System.out.println(n);
        }

        System.out.println("=====================double array using advanced for loop============================");
        //12.33, 34.55,67.88, 45.54, 98.65

        double[] dns = {12.33, 34.55,67.88, 45.54, 98.65};
//        for(int i1 =0; i1< dns.length; i1++)
//        {
//            System.out.println(dns[i1]);
//        }

        for(double d : dns)
        {
            System.out.println(d);
        }


        // Emma, Abdul, Akhilesh, Zubair, Ahmad

        String[] names = {"Emma", "Abdul", "Akhilesh", "Zubair", "Ahmad"};
//        System.out.println(names.length); //5
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);

        System.out.println("=======================String Array using advanced for loop==========================");
//        int j =0;
//        while (j<names.length)
//        {
//            System.out.println(names[j]);
//            j++;
//        }
//        for(String n : names)
//        {
//            if(!(n.equals("Abdul"))) {
//                System.out.println(n);
//            }
//        }

        System.out.println(Arrays.toString(names));
    }
}
