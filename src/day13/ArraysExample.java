package day13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExample
{
    public static void main(String[] args) {
        String [] menus = {"Home", "Gift Certificate", "Brands", "Blogs", "Contact Us"};
        int i=0;
        while (i<menus.length)
        {
            System.out.println(menus[i]);
            i++;
        }

        String studentNames[] = new String[5];

        // Ashish, 29, M, False, 70.65

        Object[] myData ={"Ashish", 29, 'M', false, 70.65};
        //1.
        System.out.println(Arrays.toString(myData));

        // while
        int k=0;
        while (k<myData.length)
        {
            System.out.println(myData[k]);
            k++;
        }


        for (int k1=0;k1<myData.length;k++)
        {
            System.out.println(myData[k1]);
        }

        for(Object md : myData)
        {
            System.out.println(md);
        }


        //1. dataType[] arrayName = {value1, value2, value3.................valueN};

        //2. dataType[] arrayName = new dataType[countOfItemsYouWantToStore];
        Object[] yourData = new Object[5];
        yourData[0]="Ashish";
        yourData[1]='F';
        yourData[2]=true;
        yourData[3]=12.33;
        yourData[4]="Basen";
        //yourData[5]='G';

    }
}
