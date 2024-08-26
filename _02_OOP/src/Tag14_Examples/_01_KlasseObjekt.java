package Tag14_Examples;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_KlasseObjekt {
    public static void main(String[] args) {
        int zahl;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();

        Auto meinAuto = new Auto();
        meinAuto.farbe = "rot";
        meinAuto.baujahr = 2024;
        meinAuto.motorHubraum = 1600;
        meinAuto.marke = "Tesla";

        System.out.println("meinAuto.marke = " + meinAuto.marke);
        System.out.println("meinAuto.baujahr = " + meinAuto.baujahr);
        System.out.println("meinAuto.motorHubraum = " + meinAuto.motorHubraum);
        System.out.println("meinAuto.farbe = " + meinAuto.farbe);
    }
    // METHODEN oder FUNKTIONEN werden hier definiert
}

// KLASSEN werden hier definiert

class Auto {
    String farbe;
    int baujahr;
    String marke;
    int motorHubraum;
}
