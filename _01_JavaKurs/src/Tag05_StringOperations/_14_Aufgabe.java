package Tag05_StringOperations;

import java.util.Scanner;

public class _14_Aufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1- Vereinen Sie den getrennt eingegebenen Vornamen und Nachnamen mit einem Leerzeichen dazwischen.
        System.out.print("Geben Sie Ihren Vornamen ein: ");
        String name = scanner.nextLine().trim();
        System.out.print("Geben Sie Ihren Nachnamen ein: ");
        String nachname = scanner.nextLine().trim();
        System.out.println("Ihr Name und Nachname ist: " + name + " " + nachname);

        //2- Drucken Sie aus, ob ein eingegebenes Wort leer ist oder nicht.
        System.out.print("Geben Sie einen Text ein: ");
        String text = scanner.nextLine();
        boolean istLeer = text.isEmpty();
        System.out.println("Ist leer? " + istLeer);

        //3- Finden Sie die Anzahl der Buchstaben 'A' (ohne Groß-/Kleinschreibung) in einem eingegebenen Satz.
        System.out.print("Geben Sie einen Text ein: ");
        String text2 = scanner.nextLine().toLowerCase();
        int anzahlA = text2.replaceAll("[^a]", "").length();
        System.out.println("Anzahl der Buchstaben 'A': " + anzahlA);

        //4- Finden Sie den ersten und den letzten Buchstaben eines eingegebenen Wortes.
        System.out.print("Geben Sie einen Text ein: ");
        String text3 = scanner.nextLine().trim();
        char ersterBuchstabe = text3.charAt(0);
        char letzterBuchstabe = text3.charAt(text3.length() - 1);
        System.out.println("Erster Buchstabe: " + ersterBuchstabe + " - Letzter Buchstabe: " + letzterBuchstabe);

        //5- Drucken Sie das erste Wort in einem eingegebenen Satz aus.
        System.out.print("Geben Sie einen Satz ein: ");
        String satz = scanner.nextLine();
        String erstesWort = satz.split(" ")[0];
        System.out.println("Erstes Wort: " + erstesWort);

        //6- Drucken Sie die ersten beiden Wörter in einem eingegebenen Satz aus (mindestens 3 Wörter).
        System.out.print("Geben Sie einen Satz mit mindestens 3 Wörtern ein: ");
        String satz3Worte = scanner.nextLine();
        String[] woerter = satz3Worte.split(" ");
        String erstesWort1 = woerter[0];
        String zweitesWort = woerter[1];
        System.out.println("Erstes Wort: " + erstesWort1 + " - Zweites Wort: " + zweitesWort);
    }
}
