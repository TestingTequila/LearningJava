package day33;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept
{
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("Ashish", 343534);
        hm.put("Jason", 43534534);
        hm.put("Roger", 675675);
        hm.put("Kerrie", 45654654);
        hm.put("Lee", 43543534);
        hm.put("Lee", 5555555);

        System.out.println(hm.get("Lee"));


        Map<String, Integer> hm1 = new HashMap();
        hm1.put("Ashish", 343534);
        hm1.put("Jason", 43534534);
        hm1.put("Roger", 675675);
        hm1.put("Kerrie", 45654654);
        hm1.put("Lee", 43543534);
        hm1.put("Lee", 5555555);

        System.out.println(hm.get("Lee"));
    }
}
