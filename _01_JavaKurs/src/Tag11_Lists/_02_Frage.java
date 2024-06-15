package Tag11_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_Frage {
    public static void main(String[] args) {
        // Von der Benutzer erhaltene 6-Elemente (Zahlen) Array
        // nur die ungeraden Zahlen in ein separates Array (Liste) (ArrayList) zu speichern
        // und ausgeben.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];

        // Benutzer zur Eingabe von Zahlen auffordern
        for (int i = 0; i < array.length; i++) {
            System.out.print("Zahl = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("array = " + Arrays.toString(array));

        // ArrayList für ungerade Zahlen erstellen
        ArrayList<Integer> ungeradeZahlen = new ArrayList<>();

        // Ungerade Zahlen in die ArrayList hinzufügen
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                ungeradeZahlen.add(array[i]);
        }
        System.out.println("ungeradeZahlen = " + ungeradeZahlen);

        // 2. Methode: Ungerade Zahlen nacheinander ausgeben
        for (int i = 0; i < ungeradeZahlen.size(); i++)
            System.out.print(ungeradeZahlen.get(i) + " ");
    }
}
