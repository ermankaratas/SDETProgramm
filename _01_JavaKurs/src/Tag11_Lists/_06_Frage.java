package Tag11_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_Frage {
    public static void main(String[] args) {
        // Ein Wörterbuch soll erstellt werden.
        // Der Benutzer soll so viele Informationen erhalten, wie er möchte, bestehend aus Wort und Bedeutung.
        // Dann soll der Benutzer ein Wort eingeben und dessen Bedeutung ausgeben.

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> woerter = new ArrayList<>();
        ArrayList<String> bedeutungen = new ArrayList<>();

        String option;
        do {
            System.out.print("Geben Sie ein Wort ein: ");
            woerter.add(scanner.nextLine());
            System.out.print("Geben Sie die Bedeutung ein: ");
            bedeutungen.add(scanner.nextLine());

            System.out.println("Möchten Sie fortfahren? (E für Ja, H für Nein)");
            System.out.print("Ihre Wahl: ");
            option = scanner.nextLine();
        } while (option.equalsIgnoreCase("E"));

        System.out.print("Geben Sie das gesuchte Wort ein: ");
        String gesuchtesWort = scanner.nextLine();

        for (int i = 0; i < woerter.size(); i++) {
            if (woerter.get(i).equalsIgnoreCase(gesuchtesWort)) {
                System.out.println("Die Bedeutung: " + bedeutungen.get(i));
            }
        }

        // Meine Lösung, aber es ist erforderlich, die Einträge in der gleichen Reihenfolge zu halten
        ArrayList<String> woerterbuch = new ArrayList<>();

        String auswahl;
        do {
            System.out.print("Wort: ");
            woerterbuch.add(scanner.nextLine());
            System.out.print("Bedeutung: ");
            woerterbuch.add(scanner.nextLine());

            System.out.println("Möchten Sie fortfahren? (E für Ja, H für Nein)");
            System.out.print("Ihre Wahl: ");
            auswahl = scanner.nextLine();
        } while (auswahl.equalsIgnoreCase("E"));

        System.out.print("Geben Sie ein Wort ein: ");
        String wort = scanner.nextLine();
        for (int i = 0; i < woerterbuch.size(); i++) {
            if (wort.equalsIgnoreCase(woerterbuch.get(i))) {
                System.out.println("Bedeutung des Wortes: " + woerterbuch.get(i + 1));
            }
        }
    }
}
