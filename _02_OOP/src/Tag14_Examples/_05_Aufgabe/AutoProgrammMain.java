package Tag14_Examples._05_Aufgabe;

import java.util.Scanner;

public class AutoProgrammMain {
    public static void main(String[] args) {
        int anzahlAufzeichnungen = 20;
        Auto[] autos = new Auto[anzahlAufzeichnungen];
        autos = AutoInformationenEingeben(anzahlAufzeichnungen);
        System.out.println("-------");
        AutoInformationenLesen(autos);
        System.out.println("-------");
        DurchschnittsHerstellungsjahr(autos);
    }

    public static Auto[] AutoInformationenEingeben(int anzahlAufzeichnungen) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);
        Auto[] autos = new Auto[anzahlAufzeichnungen];

        for (int i = 0; i < autos.length; i++) {
            Auto auto = new Auto();
            System.out.print("Geben Sie die Auto-Nummer ein = ");
            auto.number = scannerInt.nextInt();
            System.out.print("Geben Sie das Auto-Modell ein = ");
            auto.model = scannerStr.nextLine();
            System.out.print("Geben Sie das Herstellungsjahr ein = ");
            auto.manufactureDate = scannerInt.nextInt();
            autos[i] = auto;
        }
        return autos;
    }

    public static void AutoInformationenLesen(Auto[] autos) {
        for (Auto auto : autos) {
            System.out.println("Auto-Nummer = " + auto.number);
            System.out.println("Auto-Modell = " + auto.model);
            System.out.println("Herstellungsjahr = " + auto.manufactureDate);
            System.out.println("-----");
        }
    }

    public static void DurchschnittsHerstellungsjahr(Auto[] autos) {
        int summe = 0;
        for (Auto auto : autos) {
            summe += auto.manufactureDate;
        }
        double durchschnitt = (double) summe / autos.length;
        System.out.println("Durchschnittliches Herstellungsjahr = " + durchschnitt);
    }
}