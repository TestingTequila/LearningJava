package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConcept
{
    public static void main(String[] args) {
        // 5 integer numbers
        int[] numbers = new int[5]; //Static Array
        System.out.println("Size of an Array: "+numbers.length);
        numbers[0]=12;
        numbers[1]=44;
        numbers[2]=36;
        numbers[3]=100;
        numbers[4]=62;
        System.out.println(Arrays.toString(numbers));
        //numbers[5]=85;
        //numbers[6]=66;

        int[] num = {12,44,35,67,78,90};

        List<int[]> lst=Arrays.asList(num);

        //Collections
        //1. ArrayList

        ArrayList list = new ArrayList();
        System.out.println("Size of an arrayList: "+list.size());
        list.add(12); //0
        list.add(44); //1
        list.add(26); //2
        list.add(62); //3
        list.add(92);
        list.add(33);
        list.add(33);
        list.add(5);
        list.add(76);
        list.add(41);


        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        int i=0;
        while(i<list.size())
        {
            System.out.println(list.get(i));
            i++;
        }

        System.out.println("Size of an arrayList: "+list.size());
        list.add(48); //byte
        list.add(129);//short
        //list.add(324234234234);
        list.add('c');
        list.add(12.33);
        list.add(12.45f);
        list.add(true);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list);


         for(Object o : list)
         {
             System.out.println(o);
         }







    }
}
