package Tag07_Loops;

import java.util.Scanner;

public class _02_Frage {
    public static void main(String[] args) {
        // Scanner-Objekt zur Eingabeerfassung erstellen
        Scanner scan = new Scanner(System.in);

        // Initialisierung der Variablen
        int i = 0;
        int total = 0;

        // Schleife, um sechs Zahlen vom Benutzer zu erhalten
        while (i < 6) {
            System.out.print("Geben Sie eine Zahl ein: ");
            int number = scan.nextInt();

            // Nur positive Zahlen zur Gesamtsumme hinzufügen
            if (number > 0) {
                total += number;
            }

            i++; // Schleifenzähler inkrementieren
        }

        // Gesamtsumme der positiven Zahlen ausgeben
        System.out.println("Gesamtsumme der positiven Zahlen = " + total);
    }
}
