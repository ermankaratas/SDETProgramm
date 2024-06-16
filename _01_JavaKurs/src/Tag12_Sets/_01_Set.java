package Tag12_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _01_Set {
    public static void main(String[] args) {
        // Wenn duplizierte Daten vorliegen, WERDEN SIE NICHT HINZUGEFÜGT
        // Index wird nicht beibehalten
        // Je nach Wunsch
        // Entweder IMMER sortiert
        // Oder sortiert nach der Reihenfolge des Hinzufügens
        // Oder sortiert nach eigener Präferenz

        // TreeSet         -> IMMER SORTIERT
        // LinkedHashSet   -> Sortiert nach der Reihenfolge des Hinzufügens
        // HashSet         -> Reihenfolge ist unwichtig, FUNKTIONIERT SCHNELL

        HashSet<Integer> hashSet1 = new HashSet<>();

        hashSet1.add(1); hashSet1.add(2); hashSet1.add(38); hashSet1.add(22); hashSet1.add(4);
        System.out.println("hashSet1 = " + hashSet1);
        // Lassen Sie uns überprüfen, ob es hinzugefügt wird
        hashSet1.add(1); hashSet1.add(2);

        System.out.println("hashSet1 = " + hashSet1);

        // Wir haben allen drei gleich hinzugefügt, die Unterschiede in der Reihenfolge sind zu erkennen
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("eins"); lhs.add("zwei"); lhs.add("drei"); lhs.add("vier"); lhs.add("fünf");
        System.out.println("lhs = " + lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("eins"); ts.add("zwei"); ts.add("drei"); ts.add("vier"); ts.add("fünf");
        System.out.println("ts = " + ts);

        HashSet<String> hs = new HashSet<>();
        hs.add("eins"); hs.add("zwei"); hs.add("drei"); hs.add("vier"); hs.add("fünf");
        System.out.println("hs = " + hs);
    }
}
