package Tag06_IfElse;

import java.util.Scanner;

public class _04_Aufgabe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        //1- Nehmen Sie die Noten des Schülers für die Zwischenprüfung und die Abschlussprüfung entgegen.
        //   Berechnen Sie den Durchschnitt mit der Formel: avg = 0,4 * Zwischenprüfung + 0,6 * Abschlussprüfung.
        //   Wenn der Durchschnitt 50 oder höher ist, geben Sie "BESTANDEN" aus, ansonsten "NICHT BESTANDEN".
        System.out.print("Geben Sie Ihre Zwischenprüfungsnote ein: ");
        int zwischenpruefung = scanner.nextInt();
        System.out.print("Geben Sie Ihre Abschlussprüfungsnote ein: ");
        int abschlusspruefung = scanner.nextInt();
        double durchschnittsNote = (0.4 * zwischenpruefung) + (0.6 * abschlusspruefung);
        if (durchschnittsNote >= 50)
            System.out.println("BESTANDEN");
        else
            System.out.println("NICHT BESTANDEN");

        //2- Finden Sie das größte von drei eingegebenen Zahlen.
        System.out.print("Geben Sie die erste Zahl ein: ");
        int ersteZahl = scanner.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zweiteZahl = scanner.nextInt();
        System.out.print("Geben Sie die dritte Zahl ein: ");
        int dritteZahl = scanner.nextInt();
        if (ersteZahl > zweiteZahl && ersteZahl > dritteZahl)
            System.out.println("Die größte Zahl ist: " + ersteZahl);
        else {
            if (zweiteZahl > dritteZahl)
                System.out.println("Die größte Zahl ist: " + zweiteZahl);
            else
                System.out.println("Die größte Zahl ist: " + dritteZahl);
        }

        //3- Lesen Sie zwei Spendenbeträge mit Währung (z. B. 500€) ein.
        //   Wenn die Summe der Spendenbeträge größer als 1000 ist, geben Sie "GROßSPENDE" aus, ansonsten "NORMALE SPENDE".
        System.out.print("Geben Sie Ihren Spendenbetrag ein (mit Währung): ");
        String spendenBetrag1 = scannerStr.nextLine().replaceAll("[^0-9]", "");
        System.out.print("Geben Sie den Spendenbetrag Ihres Freundes ein (mit Währung): ");
        String spendenBetrag2 = scannerStr.nextLine().replaceAll("[^0-9]", "");
        int spendenBetrag1Int = Integer.parseInt(spendenBetrag1);
        int spendenBetrag2Int = Integer.parseInt(spendenBetrag2);
        if (spendenBetrag1Int + spendenBetrag2Int > 1000)
            System.out.println("GROßSPENDE");
        else
            System.out.println("NORMALE SPENDE");

        //4- Prüfen Sie, ob der erste und der letzte Buchstabe eines eingegebenen Wortes gleich sind.
        System.out.print("Geben Sie ein Wort ein: ");
        String wort = scannerStr.nextLine();
        int wortLaenge = wort.length();
        char ersterBuchstabe = wort.charAt(0);
        char letzterBuchstabe = wort.charAt(wortLaenge - 1);
        if (ersterBuchstabe == letzterBuchstabe)
            System.out.println("Der erste und letzte Buchstabe sind gleich");
        else
            System.out.println("Der erste und letzte Buchstabe sind nicht gleich");

        //5- Finden Sie die kleinste von drei eingegebenen Zahlen.
        System.out.print("Geben Sie die erste Zahl ein: ");
        int ersteZahl1 = scanner.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zweiteZahl1 = scanner.nextInt();
        System.out.print("Geben Sie die dritte Zahl ein: ");
        int dritteZahl1 = scanner.nextInt();
        if (ersteZahl1 < zweiteZahl1 && ersteZahl1 < dritteZahl1)
            System.out.println("Die kleinste Zahl ist: " + ersteZahl1);
        else {
            if (zweiteZahl1 < dritteZahl1)
                System.out.println("Die kleinste Zahl ist: " + zweiteZahl1);
            else
                System.out.println("Die kleinste Zahl ist: " + dritteZahl1);
        }

        //6- Grüßen Sie je nach Tageszeit ("Guten Morgen" oder "Guten Abend"), basierend auf der eingegebenen Uhrzeit.
        System.out.print("Wie spät ist es? (Geben Sie die Stunden ein): ");
        String stunde = scannerStr.nextLine().replaceAll("[^0-9]", "");
        if (stunde.length() == 4)
            stunde = stunde.substring(0, 2);
        else
            stunde = stunde.substring(0, 1);
        int stundeInt = Integer.parseInt(stunde);
        if (stundeInt < 12)
            System.out.println("Guten Morgen");
        else
            System.out.println("Guten Abend");

        //7- Überprüfen Sie, ob eine E-Mail-Adresse sowohl einen Punkt als auch ein @-Zeichen enthält.
        System.out.print("Geben Sie Ihre E-Mail-Adresse ein: ");
        String email = scannerStr.nextLine();
        if (email.contains(".") && email.contains("@"))
            System.out.println("Ihre E-Mail-Adresse ist korrekt.");
        else
            System.out.println("Sie haben vergessen, @ oder . einzugeben.");
    }
}
