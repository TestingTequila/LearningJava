package day33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTopCasting
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("Chrome");
//        list.add("Firefox");
//        list.add("IE");
//        list.add("Safari");
//        list.add("Edge");

        List<String> browser=Arrays.asList("Chrome", "Firefox", "IE", "Safari", "Edge");

        System.out.println(browser);
    }

}
