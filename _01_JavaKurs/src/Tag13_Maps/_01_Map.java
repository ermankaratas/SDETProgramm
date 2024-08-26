package Tag13_Maps;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Eine Map besteht aus Schlüssel (Key) und Wert (Value)
        // Wenn sich in einer Map duplizierte Werte befinden, werden sie nicht hinzugefügt.
        // Aber die Map überprüft, ob es sich bei dem Schlüssel (Key) um eine Duplikation handelt.
        // Wenn ein Schlüssel dupliziert ist, wird der Wert des Schlüssels aktualisiert.

        // Ähnlich wie bei Sets gibt es HashMap, LinkedHashMap und TreeMap in Maps.

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "İsmet Temur");                        // Statt "add" wird "put" verwendet
        hm.put(2001, "Esma");
        hm.put(2, "Oğuzhan");
        hm.put(1003, "Kaan");
        hm.put(1001, "Ahmet Kaya");
        System.out.println("hm = " + hm);

        System.out.println("hm.get(2001) = " + hm.get(2001));

        System.out.println("hm.containsKey(1003) = " + hm.containsKey(1003));

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        hm.remove(1001);
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("hm = " + hm);
    }
}
