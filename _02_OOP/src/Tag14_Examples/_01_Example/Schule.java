package Tag14_Examples._01_Example;

// Ein Modul soll für ein Schulregistrierungsprogramm erstellt werden,
// das die Informationen eines Schülers aufnimmt.
// Ein Schüler hat folgende Informationen: Vorname, Nachname, Klasse und Adresse.
// Erstellen Sie diese Struktur.
// Definieren Sie anschließend einen Schüler, weisen Sie Werte zu und geben Sie diese aus.


public class Schule {
    public static void main(String[] args) {
        Schueler schueler1 = new Schueler();
        schueler1.schulNummer = 1001;
        schueler1.vorname = "Kaan";
        schueler1.nachname = "Gül";
        schueler1.klasse = 12;

        System.out.println("schueler1.schulNummer = " + schueler1.schulNummer);
        System.out.println("schueler1.vorname = " + schueler1.vorname);
        System.out.println("schueler1.nachname = " + schueler1.nachname);
        System.out.println("schueler1.klasse = " + schueler1.klasse);
        System.out.println("schueler1.adresse = " + schueler1.adresse);
    }
}

class Schueler {
    int schulNummer;
    String vorname;
    String nachname;
    int klasse;
    String adresse;
}

