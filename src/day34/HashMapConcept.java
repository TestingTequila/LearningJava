package day34;

import java.util.*;

public class HashMapConcept {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        System.out.println(phoneBook.size());//0

        phoneBook.put("Jason", 435345);
        phoneBook.put("Ashish", 45654654);
        phoneBook.put("Tek Chand", 56765756);
        phoneBook.put("Tek Chand", 56765756);
        phoneBook.put("Tek Chand", 5756);
        phoneBook.put("Kerrie", 567756);
        phoneBook.put("Tony", 567756);

        System.out.println(phoneBook.size()); //5
        System.out.println(phoneBook); //{Tony=567756, Kerrie=567756, Ashish=45654654, Jason=435345, Tek Chand=56765756}
        System.out.println(phoneBook.keySet()); //get all keys
        System.out.println(phoneBook.values()); //get all values
        System.out.println(phoneBook.get("Jason")); //get value for specific key
        Set<String> customerName= phoneBook.keySet(); //get all keys, store and loop over it using advanced for loop
        Collection<Integer> landlineNumber =phoneBook.values();//get all values, store and loop over it using advanced for loop

        Map<String, Integer> mobileBook = new HashMap<>(); //Top Casting
        LinkedHashMap<String, Integer> cityPhoneBook = new LinkedHashMap<>();// Ordered Output

        System.out.println(cityPhoneBook.size());//0
        cityPhoneBook.put("Jason", 435345);
        cityPhoneBook.put("Ashish", 45654654);
        cityPhoneBook.put("Tek Chand", 56765756);
        cityPhoneBook.put("Kerrie", 567756);
        cityPhoneBook.put("Tony", 567756);
        System.out.println(cityPhoneBook.size());//5
        System.out.println(cityPhoneBook); //{Jason=435345, Ashish=45654654, Tek Chand=56765756, Kerrie=567756, Tony=567756}
    }
}
