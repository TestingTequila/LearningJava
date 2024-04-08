package day33;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2
{
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(44);
        list1.add(92);
        list1.add(33);
        list1.add(33);
        list1.add(5);
        list1.add(76);
        list1.add(41);

        for(Integer l : list1)
        {
            System.out.println(l);
        }

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Ashish");
        list3.add("Jason");
        list3.add("Roger");
        list3.add("Kerrie");
        list3.add("Lee");


        System.out.println(list3);

        for(String s : list3)
        {
            if(s.equals("Kerrie"))
            {
                System.out.println(" She is amazing");
            }
            System.out.println(s);
        }

    }
}
