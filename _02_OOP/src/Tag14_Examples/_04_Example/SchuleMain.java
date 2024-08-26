package Tag14_Examples._04_Example;

// Ein Modul soll für ein Schulregistrierungsprogramm erstellt werden,
// das die Informationen eines Schülers aufnimmt.
// Ein Schüler hat folgende Informationen: Name, Nachname, Klasse und Adresse.
// Erstellen Sie diese Struktur.
// Füllen Sie anschließend die Informationen für 3 Schüler durch Benutzereingabe aus.

import java.util.ArrayList;
import java.util.Scanner;

public class SchuleMain {
    public static void main(String[] args) {
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        Schueler[] schuelerArray = new Schueler[3];

        for (int i = 0; i < schuelerArray.length; i++) {   // schuelerArray[i] = new Schueler(); şeklinde de kullanabilirsin
            Schueler schueler = new Schueler();            // bu durumda bütün okumalar schuelerArray[i].name gibi olur
            System.out.print("Name eingeben = ");
            schueler.name = scannerStr.nextLine();
            System.out.print("Nachname eingeben = ");
            schueler.nachname = scannerStr.nextLine();
            System.out.print("Klasse eingeben = ");
            schueler.klasse = scannerInt.nextInt();
            System.out.print("Adresse eingeben = ");
            schueler.adresse = scannerStr.nextLine();
            schuelerArray[i] = schueler;                      // bu satıra da gerek kalmaz
        }
        for (int i = 0; i < schuelerArray.length; i++) {                                // FOREACH ile de yapılabilir
            System.out.println("Schülername = " + schuelerArray[i].name);               // 2.Yöntem de foreach var
            System.out.println("Schülernachname = " + schuelerArray[i].nachname);
            System.out.println("Schülerklasse = " + schuelerArray[i].klasse);
            System.out.println("Schüleradresse = " + schuelerArray[i].adresse);
        }

        // 2. YÖNTEM

        ArrayList<Schueler> schuelerListe = new ArrayList<>();

        System.out.print("Anzahl der Datensätze eingeben = ");
        int datensaetze = scannerInt.nextInt();
        for (int i = 0; i < datensaetze; i++) {
            Schueler schueler = new Schueler();
            System.out.print("Name eingeben = ");
            schueler.name = scannerStr.nextLine();
            System.out.print("Nachname eingeben = ");
            schueler.nachname = scannerStr.nextLine();
            System.out.print("Klasse eingeben = ");
            schueler.klasse = scannerInt.nextInt();
            System.out.print("Adresse eingeben = ");
            schueler.adresse = scannerStr.nextLine();
            schuelerListe.add(schueler);
        }

        for(Schueler schueler : schuelerListe){
            System.out.println("Schülername = " + schueler.name);
            System.out.println("Schülernachname = " + schueler.nachname);
            System.out.println("Schülerklasse = " + schueler.klasse);
            System.out.println("Schüleradresse = " + schueler.adresse);
        }
    }
}
