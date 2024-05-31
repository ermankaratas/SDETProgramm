package Tag12_Sets;

import java.util.HashMap;
import java.util.Scanner;

public class _07_Frage {
    public static void main(String[] args) {
        // Es soll ein Live-Wörterbuch erstellt werden.
        // Dem Benutzer wird das folgende Menü angezeigt.
        // 1- Hinzufügen (In dieser Option wird das Wort und seine Bedeutung eingegeben)
        // 2- Bearbeiten (In dieser Option wird der Benutzer aufgefordert, die Bedeutung eines Wortes zu bearbeiten)
        // 3- Auflisten
        // 4- Suche (In dieser Option wird die Bedeutung eines gegebenen Wortes ausgegeben)
        // 5- Löschen
        // 6- Beenden

        HashMap<String, String> woerterbuch = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        int auswahl = 0;
        do {
            menueAnzeigen();
            auswahl = scanner.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.print("Geben Sie das Wort ein = ");
                    String wortKey = scannerStr.nextLine();
                    System.out.print("Geben Sie die Bedeutung ein = ");
                    String wortWert = scannerStr.nextLine();
                    woerterbuch.put(wortKey, wortWert);
                    break;
                case 2:
                    System.out.print("Geben Sie das Wort ein = ");
                    wortKey = scannerStr.nextLine();
                    System.out.println("Die Bedeutung ist " + woerterbuch.get(wortKey));
                    System.out.print("Bedeutung bearbeiten = ");
                    wortWert = scannerStr.nextLine();
                    woerterbuch.put(wortKey, wortWert);
                    break;
                case 3:
                    System.out.println("Wörterbuch = " + woerterbuch);
                    break;
                case 4:
                    System.out.print("Suche nach dem Wort = ");
                    wortKey = scannerStr.nextLine();
                    System.out.println("Die Bedeutung ist " + woerterbuch.get(wortKey));
                    break;
                case 5:
                    System.out.print("Wort löschen = ");
                    wortKey = scannerStr.nextLine();
                    woerterbuch.remove(wortKey);
                    System.out.println(wortKey + " wurde gelöscht");
                    break;
            }
        } while (auswahl != 6);
    }

    public static void menueAnzeigen() {
        System.out.println("MENÜ");
        System.out.println("---------");
        System.out.println("1 - Hinzufügen ");
        System.out.println("2 - Bearbeiten");
        System.out.println("3 - Auflisten");
        System.out.println("4 - Suche");
        System.out.println("5 - Löschen");
        System.out.println("6 - Beenden");
        System.out.println("----------");
        System.out.print("Geben Sie Ihre Auswahl mit der Menünummer ein = ");
    }
}
