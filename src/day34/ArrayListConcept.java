package day34;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());//0
        System.out.println(numbers.isEmpty());//true
        numbers.add(11);
        numbers.add(34);
        numbers.add(56);
        numbers.add(67);
        numbers.add(100);
        numbers.add(33);
        numbers.add(34);
        numbers.add(45);
        numbers.add(99);
        numbers.add(1987);
        System.out.println(numbers.size());//10
        numbers.add(13);
        numbers.add(87);
        numbers.add(76);
        numbers.add(44);
        numbers.add(82);
        System.out.println(numbers.size());//15

        System.out.println("========DIRECT PRINT===================");
        System.out.println(numbers);

        System.out.println("========WHILE LOOP===================");
        int i = 0;
        while (i < numbers.size()) {
            System.out.println(numbers.get(i));
            i++;
        }

        System.out.println("========FOR LOOP===================");

        for (int i1 = 0; i1 < numbers.size(); i1++) {
            System.out.println(numbers.get(i1));

        }

        System.out.println("========ADVANCED FOR LOOP===================");
        for (Integer n : numbers) {
            System.out.println(n);
        }

        numbers.remove(3);
        System.out.println("========ADVANCED FOR LOOP REMOVE FUNCTION===================");
        for (Integer n : numbers) {
            System.out.println(n);
        }
        System.out.println(numbers.size());
        numbers.add(3, 67);
        System.out.println("========ADVANCED FOR LOOP ADD 67 AGAIN===================");
        for (Integer n : numbers) {
            System.out.println(n);
        }

        //Object[] numbersArray =numbers.toArray();
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(1987));
        System.out.println("numbers.size(): Before: "+numbers.size());
        numbers.add(3, 677777);
        System.out.println(numbers);
        System.out.println("numbers.size(): After: "+ numbers.size());


    }
}
