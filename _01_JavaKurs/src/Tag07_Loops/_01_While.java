package Tag07_Loops;

import java.util.Scanner;

public class _01_While {
    public static void main(String[] args) {
        // Scanner-Objekt zur Eingabeerfassung erstellen
        Scanner scan = new Scanner(System.in);

        // Initialisierung der Variablen
        int i = 0;
        int total = 0;

        // Schleife, um fünf Zahlen vom Benutzer zu erhalten
        while (i < 5) {
            System.out.print("Geben Sie eine Zahl ein: ");
            int number = scan.nextInt();

            // Jede eingegebene Zahl zur Gesamtsumme hinzufügen
            total += number;

            i++; // Schleifenzähler inkrementieren
        }

        // Gesamtsumme der fünf eingegebenen Zahlen ausgeben
        System.out.println("Gesamtsumme = " + total);
    }
}
