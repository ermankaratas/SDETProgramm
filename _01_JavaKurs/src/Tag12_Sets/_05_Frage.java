package Tag12_Sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _05_Frage {
    public static void main(String[] args) {
        // Füllen eines 10-elementigen Arrays mit Zufallszahlen von 0 bis 10 (einschließlich)
        // und Speichern der nicht wiederholten Werte in einem neuen Array

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++)
            ints[i] = (int)(Math.random() * 11);

        System.out.println("ints = " + Arrays.toString(ints));

        // 1. Methode
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < ints.length; i++)
            hs.add(ints[i]);
        System.out.println("hs = " + hs);

        // 2. Methode
        Integer[] dizi2 = new Integer[10];
        for (int i = 0; i < dizi2.length; i++)
            dizi2[i] = (int)(Math.random() * 11);
        System.out.println("dizi2 = " + Arrays.toString(dizi2));
        HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(dizi2));
        System.out.println("hs2 = " + hs2);

        // 3. Methode
        HashSet<Integer> hs3 = new HashSet<>();
        hs3.addAll(Arrays.asList(dizi2));
        System.out.println("hs3 = " + hs3);

        // 4. Methode
        HashSet<Integer> hs4 = new HashSet<>();
        Collections.addAll(hs4, dizi2);
        System.out.println("hs4 = " + hs4);
    }
}
