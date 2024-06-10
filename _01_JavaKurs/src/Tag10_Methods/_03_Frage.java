package Tag10_Methods;

import java.util.Arrays;

public class _03_Frage {
    public static void main(String[] args) {
        // Im main 20-Elemente-Array definieren und anschließend an eine Funktion senden,
        // die es mit zufälligen Zahlen bis 100 füllt und auch ausgibt.

        int[] zahlen = new int[20];
        arrayFuellen(zahlen);
    }

    public static void arrayFuellen(int[] zahlenFonk) {
        for (int i = 0; i < zahlenFonk.length; i++) {
            zahlenFonk[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(zahlenFonk));
    }
}
