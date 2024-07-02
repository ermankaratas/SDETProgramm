package Tag12_Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class _03_Iterator {
    public static void main(String[] args) {
        // FOREACH gibt die Elemente nicht in der Reihenfolge zurück, daher verwenden wir ITERATOR,
        // um sie in der gewünschten Reihenfolge zu erhalten
        // SETs geben Elemente in der Reihenfolge zurück, in der sie im Speicher gespeichert sind,
        // während FOREACH Elemente in beliebiger Reihenfolge zurückgibt
        // (da es keine Indizes gibt)

        TreeSet<String> farben = new TreeSet<>();
        farben.add("Rot"); farben.add("Grün"); farben.add("Blau"); farben.add("Rot"); farben.add("ROT");

        System.out.println("renkler = " + farben);

        Iterator<String> iterator = farben.iterator();                 // Iterator wird auf den Anfang des TreeSet gesetzt
        while (iterator.hasNext()){                                    // Wenn es noch Elemente in der Reihenfolge gibt
            System.out.println("farben = " + iterator.next());         // next() gibt das aktuelle Element des Iterators zurück
        }
    }
}
