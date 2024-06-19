package Tag11_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Frage {
    public static void main(String[] args) {
        // Von einem Lehrer beliebig viele Noten eingeben lassen,
        // den Lehrer fragen, ob er fortfahren möchte (J/N)
        // und die Anzahl der Schüler finden, die den Durchschnitt überschreiten.

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> noten = new ArrayList<>();
        String wahl;
        int summe = 0;
        do {
            System.out.print("Note eingeben = ");
            int note = scanner.nextInt();
            noten.add(note);
            summe += note;
            System.out.println("Wenn Sie fortfahren möchten, drücken Sie J");
            System.out.println("Wenn Sie aufhören möchten, drücken Sie N");
            scanner.nextLine(); // Hier wird die neue Zeile nach der Zahleneingabe konsumiert
            System.out.print("Geben Sie Ihre Wahl ein = ");
            wahl = scanner.next();
        } while(wahl.equalsIgnoreCase("J"));
        System.out.println("Noten = " + noten);

        int durchschnitt = summe / noten.size();
        System.out.println("Durchschnitt = " + durchschnitt);

        int anzahlGepasst = 0;
        for (int i = 0; i < noten.size(); i++) {
            if (noten.get(i) >= durchschnitt)
                anzahlGepasst++;
        }
        System.out.println("Anzahl der Schüler, die den Durchschnitt überschreiten = " + anzahlGepasst);
    }
}
