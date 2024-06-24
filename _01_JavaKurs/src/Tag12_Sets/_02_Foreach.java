package Tag12_Sets;

import java.util.TreeSet;

public class _02_Foreach {
    public static void main(String[] args) {
        // Wird für die Ausgabe von SETs verwendet, da SETs keine Indizes haben

        TreeSet<String> farben = new TreeSet<>();
        farben.add("Rot"); farben.add("Grün"); farben.add("Blau"); farben.add("Rot"); farben.add("ROT");

        System.out.println("farben = " + farben);

        for(String element : farben)                       // FOREACH-Schleife
            System.out.println("Element = " + element);
    }
}
