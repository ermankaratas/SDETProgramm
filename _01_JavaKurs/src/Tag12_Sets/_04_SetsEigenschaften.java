package Tag12_Sets;

import java.util.HashSet;

public class _04_SetsEigenschaften {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1); hs.add(5); hs.add(7); hs.add(34); hs.add(3); hs.add(4);

        System.out.println("hs.size() = " + hs.size());   // Größe
        hs.remove(5);                                  // Entfernen
        System.out.println("hs = " + hs);
        if(hs.contains(7))                                // Enthalten
            System.out.println("Vorhanden");
        else
            System.out.println("Nicht vorhanden");
        hs.clear();                                       // Leeren
        System.out.println("hs = " + hs);

        // VEREINIGUNG
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        setA.add(1); setA.add(2); setA.add(3); setA.add(4); setA.add(5);
        setB.add(4); setB.add(5); setB.add(6); setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        HashSet<Integer> vereinigt = new HashSet<>();
        vereinigt.addAll(setA);
        vereinigt.addAll(setB);
        System.out.println("vereinigt = " + vereinigt);

        // setA.addAll(setB);                      // Fügt die Elemente von setB zu setA hinzu
        // System.out.println("setA = " + setA);

        // UNTERSCHIED FINDEN
        HashSet<Integer> unterschied = new HashSet<>();
        unterschied.addAll(setA);
        unterschied.removeAll(setB);                     // Entfernt die Elemente von setB aus setA
        System.out.println("unterschied = " + unterschied);

        // DURCHSCHNITT FINDEN
        HashSet<Integer> gemeinsameElemente = new HashSet<>();
        gemeinsameElemente.addAll(setA);
        gemeinsameElemente.retainAll(setB);            // Behält nur die Elemente von setA, die auch in setB enthalten sind
        System.out.println("gemeinsameElemente = " + gemeinsameElemente);
    }
}
