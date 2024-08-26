package Tag13_Maps;

import java.util.HashMap;
import java.util.Map;

public class _02_MapForEach {
    public static void main(String[] args) {
        // Verwendungen von foreach in Maps
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yılmaz");
        hm.put(2001, "Talip Yıldız");
        hm.put(5001, "Eyüpcan Bilgin");
        hm.put(1002, "Hatice Bayrak"); // 1002 wird aktualisiert

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        System.out.println("************");

        for(Integer k : hm.keySet())                // Mit einer normalen foreach-Schleife werden die Schlüssel ausgegeben
            System.out.println("k = " + k);

        System.out.println("************");

        for(String v : hm.values())                 // Mit einer normalen foreach-Schleife werden die Werte ausgegeben
            System.out.println("v = " + v);

        System.out.println("************");

        for(Map.Entry<Integer,String> kv : hm.entrySet())               // Spezielle foreach-Schleife für Maps
            System.out.println(kv.getKey() + "-" + kv.getValue());      // Dabei werden Schlüssel und Werte gemeinsam durchlaufen

    }
}
