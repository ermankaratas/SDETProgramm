package Tag05_StringOperations;

import java.util.Scanner;

public class _12_StringCompare {
    public static void main(String[] args) {
        // Überprüfen, ob das zweimal eingegebene Passwort des Benutzers identisch ist
        // Gleich oder Nicht gleich ausgeben
        // In Strings wird die Gleichheit nicht wie bei integer mit == überprüft

        Scanner scanner = new Scanner(System.in);
        System.out.print("Passwort = ");
        String passwort = scanner.nextLine();
        System.out.print("Passwort erneut eingeben = ");
        String passwortErneut = scanner.nextLine();

        boolean gleich = passwort.equals(passwortErneut);
        if (gleich)
            System.out.println("Gleich");
        if (!gleich)
            System.out.println("Nicht gleich");
    }
}
