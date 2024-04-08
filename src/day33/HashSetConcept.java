package day33;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept
{
    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(12);
        set.add(44);
        set.add(56);
        set.add(47);
        set.add(33);
        set.add(33);

        System.out.println(set);

        HashSet<String> set1 = new HashSet<String>();
        set1.add("AShish");
        set1.add("Jason");
        set1.add("Kerrie");
        set1.add("Lee");
        set1.add("Ram");
        set1.add("Raheem");

        System.out.println(set1);

        Set<String> set2 = new HashSet<String>();
        set2.add("AShish");
        set2.add("Jason");
        set2.add("Kerrie");
        set2.add("Lee");
        set2.add("Ram");
        set2.add("Raheem");

        System.out.println(set2);
    }
}
