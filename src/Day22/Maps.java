package Day22;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String []args){
        int S = 0;
        Map<String, Integer> maptest = new HashMap<>();
        maptest.put("Hello", 234);
        maptest.put("goodbye", 1998);
        maptest.entrySet();
        maptest.values();
        ((HashMap<String, Integer>) maptest).clone();
        System.out.println(((HashMap<String, Integer>) maptest).clone());
        System.out.println(maptest.values());
        maptest.put("well done", 1234567890);
        System.out.println("Entries    " + maptest.entrySet());

        for (Map.Entry<String, Integer> a : maptest.entrySet()) {
            System.out.println("Each entry " + a);

        }

        for (String str : maptest.keySet()) {
            System.out.println("Keys   "+ str);
        }



        maptest.put("j", S);
        maptest.put("O", 1);
        maptest.put("H", 1);
        maptest.put("N", 7);
        maptest.size();
        maptest.keySet();

        maptest.remove("well done", 1234567890);
        maptest.size();

        if (maptest.containsValue(234)) {
            System.out.println("ssssss");
        }
        System.out.println(maptest.values());
        System.out.println(maptest.get("Hello"));
        System.out.println(maptest);
        maptest.clear();
        System.out.println(maptest.size());
        System.out.println(maptest);



    }
}
