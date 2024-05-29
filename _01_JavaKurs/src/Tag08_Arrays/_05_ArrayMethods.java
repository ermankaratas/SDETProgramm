package Tag08_Arrays;

import java.util.Arrays;

public class _05_ArrayMethods {
    public static void main(String[] args) {
        String[] namen = {"Ahmet", "Zeynep", "Cihan"};

        // INHALT ANZEIGEN
        System.out.println("Namen = " + Arrays.toString(namen));
        // SORTIEREN, muss vor dem Drucken aufgerufen werden
        Arrays.sort(namen);
        System.out.println("Namen = " + Arrays.toString(namen));

        int [] zahlen = {1,8,65,45};
        Arrays.sort(zahlen);
        System.out.println("kleinste Zahl = " + zahlen[0]);
        System.out.println("größte Zahl = " + zahlen[zahlen.length-1]);

        // ARRAY MIT WERTEN FÜLLEN
        Arrays.fill(zahlen,5);
        System.out.println("Zahlen = " + Arrays.toString(zahlen));
    }
}
