package Day23;
import java.util.HashMap;
import java.util.Map;


public class MapExample {
    public static void main(String [] args){
        int S = 0;
        Map<String, Integer> mapexample1 = new HashMap<>();
        mapexample1.put("b;obib", 7656);
        mapexample1.put("rdew", 2002);
        mapexample1.put("groink", 43265);


        for (Map.Entry<String, Integer> a : mapexample1.entrySet()) {
            System.out.println("An Entry" + S);

        }


        mapexample1.put("fwer", 1);
        mapexample1.put("oiurt",S);
        mapexample1.size();
        mapexample1.keySet();

        mapexample1.remove("b;obib", 7656);
        mapexample1.size();

        if (mapexample1.containsValue(43265)) {
            System.out.println("noice");
        }
        System.out.println(mapexample1.values());
        System.out.println(mapexample1.get("groink"));
        System.out.println(mapexample1);
        mapexample1.clear();
        System.out.println(mapexample1);

    }
}
