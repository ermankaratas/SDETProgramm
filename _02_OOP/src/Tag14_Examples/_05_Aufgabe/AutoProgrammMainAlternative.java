package Tag14_Examples._05_Aufgabe;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoProgrammMainAlternative {
    public static void main(String[] args) {
        ArrayList<Auto> galerie = new ArrayList<>();
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Auto a = new Auto();

            System.out.print("Auto Nummer = ");
            a.autoNummer = scannerInt.nextInt();
            System.out.print("Auto Marke = ");
            a.marke = scannerStr.nextLine();
            System.out.print("Auto Produktionsjahr = ");
            a.produktionsJahr = scannerInt.nextInt();

            galerie.add(a);
        }

        galerieAusgeben(galerie); // Methode ohne Rückgabewert
        produktionsJahrDurchschnittAusgeben(galerie); // Methode ohne Rückgabewert
        int durchschnitt = produktionsJahrDurchschnittBerechnen(galerie); // Methode mit Rückgabewert
        System.out.println("Durchschnitt = " + durchschnitt);
    }

    public static int produktionsJahrDurchschnittBerechnen(ArrayList<Auto> galerie) {
        int summeProduktionsjahr = 0;
        for (Auto a : galerie) {
            summeProduktionsjahr += a.produktionsJahr;
        }

        return summeProduktionsjahr / galerie.size();
    }

    public static void produktionsJahrDurchschnittAusgeben(ArrayList<Auto> galerie) {
        int summeProduktionsjahr = 0;
        for (Auto a : galerie) {
            summeProduktionsjahr += a.produktionsJahr;
        }

        System.out.println("Durchschnitt = " + (summeProduktionsjahr / galerie.size()));
    }

    public static void galerieAusgeben(ArrayList<Auto> galerie) {
        for (Auto a : galerie) {
            System.out.println(a.autoNummer + " " + a.marke + " " + a.produktionsJahr);
        }
    }
}

