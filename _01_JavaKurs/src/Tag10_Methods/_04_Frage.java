package Tag10_Methods;

import java.util.Scanner;

public class _04_Frage {
    public static void main(String[] args) {
        // Benutzer gibt 5 Elemente ein, die im Hauptprogramm gespeichert werden,
        // danach werden das kleinste, größte Element und der Durchschnitt des Arrays
        // in separaten Funktionen ermittelt und ausgegeben.

        Scanner scanner = new Scanner(System.in);
        int[] zahlen = new int[5];
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Geben Sie eine Zahl ein: ");
            zahlen[i] = scanner.nextInt();
        }
        findMin(zahlen);
        findMax(zahlen);
        findAvg(zahlen);
    }

    public static void findMin(int[] zahlen) {
        int min = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl < min) {
                min = zahl;
            }
        }
        System.out.println("Das kleinste Element = " + min);
    }

    public static void findMax(int[] zahlen) {
        int max = zahlen[0];
        for (int zahl : zahlen) {
            if (zahl > max) {
                max = zahl;
            }
        }
        System.out.println("Das größte Element = " + max);
    }

    public static void findAvg(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        double durchschnitt = (double) summe / zahlen.length;
        System.out.println("Durchschnitt = " + durchschnitt);
    }
}
