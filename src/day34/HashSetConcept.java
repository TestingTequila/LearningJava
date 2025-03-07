package day34;

import java.util.*;

public class HashSetConcept
{
    public static void main(String[] args) {
        System.out.println("=================HashSet========================");
        HashSet<Integer> studentIid = new HashSet();
        System.out.println(studentIid.size());//0
        studentIid.add(12);
        studentIid.add(34);
        studentIid.add(15);
        studentIid.add(89);
        studentIid.add(97);
        studentIid.add(97);
        System.out.println(studentIid.size());// 5
        System.out.println(studentIid);//[97, 34, 89, 12, 15] Order Not Maintained
        for(Integer sid:studentIid)
        {
            System.out.println(sid);
        }
        //Can't use while, for loop as it's not ordered

        Set<Integer> studentsId = new HashSet(); //Top Casting
        System.out.println("=================LinkedHashSet========================");
        LinkedHashSet<Integer> studentId = new LinkedHashSet<>(); //Order is maintained







        System.out.println(studentId.size());//0
        studentId.add(12);
        studentId.add(34);
        studentId.add(15);
        studentId.add(89);
        studentId.add(97);
        studentId.add(97);
        System.out.println(studentId.size());// 5 or 1
        System.out.println(studentId);
        for(Integer sid:studentId)
        {
            System.out.println(sid);
        }
    }
}
