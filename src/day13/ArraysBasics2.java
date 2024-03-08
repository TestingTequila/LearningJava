package day13;

public class ArraysBasics2
{
    public static void main(String[] args) {
        // I want to store 10 integer numbers -->
        // dataType[] arrayName = new dataType[countOfItemsYouWantToStore];
        int[] numbers = new int[10];
        numbers[4]=67;
        numbers[1]=45;
        numbers[9]=100;
        numbers[6] =48;
        numbers[2]=21;
        numbers[6]=76;
        numbers[0]=91;
        numbers[5]=74;

//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[2]);
//        System.out.println(numbers[3]);
//        System.out.println(numbers[4]);
//        System.out.println(numbers[5]);
//        System.out.println(numbers[6]);
//        System.out.println(numbers[7]);
//        System.out.println(numbers[8]);
//        System.out.println(numbers[9]);

        System.out.println("====================while loop===========================");
        int i =0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("====================for loop===========================");

        for (int i1 =0;i1<numbers.length; i1++)
        {
            System.out.println(numbers[i1]);

        }

        System.out.println("====================advance for loop/ for each loop===========================");
        for(int num : numbers)
        {
            System.out.println(num);
        }

    }
}
