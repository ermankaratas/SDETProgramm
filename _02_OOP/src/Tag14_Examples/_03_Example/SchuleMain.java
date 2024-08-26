package Tag14_Examples._03_Example;

import java.util.Scanner;

public class SchuleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        Schueler schueler = new Schueler();

        System.out.print("Name eingeben = ");
        schueler.name = scanner.nextLine();
        System.out.print("Nachname eingeben = ");
        schueler.nachname = scanner.nextLine();
        System.out.print("Klasse eingeben = ");
        schueler.klasse = scannerInt.nextInt();
        System.out.print("Adresse eingeben = ");
        schueler.adresse = scanner.nextLine();

        System.out.println("Schülername = " + schueler.name);
        System.out.println("Schülernachname = " + schueler.nachname);
        System.out.println("Schülerklasse = " + schueler.klasse);
        System.out.println("Schüleradresse = " + schueler.adresse);
    }
}
