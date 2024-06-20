package Tag11_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _04_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(50);
        zahlen.add(5);
        zahlen.add(456);
        zahlen.add(45);
        zahlen.add(3);
        System.out.println("zahlen = " + zahlen);

        Collections.sort(zahlen);    // sortiert die Liste aufsteigend
        Collections.reverse(zahlen); // kehrt die Reihenfolge um
        System.out.println("sortierte und umgekehrte zahlen = " + zahlen);
        int maxWert = Collections.max(zahlen);     // gibt den maximalen Wert zurück
        int minWert = Collections.min(zahlen);     // gibt den minimalen Wert zurück
        System.out.println("Maximaler Wert = " + maxWert);
        System.out.println("Minimaler Wert = " + minWert);
        Collections.fill(zahlen, 0); // ersetzt alle Werte in der Liste durch den gegebenen Wert
        System.out.println("mit 0 gefüllte zahlen = " + zahlen);
        Collections.replaceAll(zahlen, 0, 5); // ersetzt alle Vorkommen des alten Werts (0) durch den neuen Wert (5)
        System.out.println("0 durch 5 ersetzte zahlen = " + zahlen);
        Collections.addAll(zahlen, 3, 4, 5); // fügt mehrere Elemente zur bestehenden ArrayList hinzu
        System.out.println("zahlen nach addAll = " + zahlen);

        Integer[] array = {2, 3, 4, 5};
        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(array)); // fügt ein Array zur ArrayList hinzu
        System.out.println("liste = " + liste);
    }
}
