package Tag07_Loops;

import java.util.Scanner;

public class _04_DoWhile {
    public static void main(String[] args) {
        // Scanner-Objekt zur Eingabeerfassung erstellen
        Scanner scan = new Scanner(System.in);
        String sentence;

        // do-while-Schleife zur wiederholten Eingabeaufforderung
        do {
            System.out.print("Geben Sie ein Zeichen ein: ");
            sentence = scan.next();
            // Wenn die Eingabe nicht "x" (unabhängig von Groß- oder Kleinschreibung) ist, dann
            if (!sentence.equalsIgnoreCase("x")) {
                System.out.println("Das Programm läuft");
            }
        } while (!sentence.equalsIgnoreCase("x")); // Schleifenbedingung

        // Wenn die Schleife endet, wird diese Meldung angezeigt
        System.out.println("Das Programm ist beendet");
    }
}
