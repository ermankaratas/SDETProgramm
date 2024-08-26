package Tag14_Examples._02_Example;

public class Schule {
    public static void main(String[] args) {
        Tag14_Examples._02_Example.Schueler schueler1 = new Tag14_Examples._02_Example.Schueler();
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
