package Tag06_IfElseSwitch;

import java.util.Scanner;

public class _08_Frage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Teil 1: Zufallszahl innerhalb eines bestimmten Bereichs
        System.out.print("Was soll die Obergrenze der zu erzeugenden Zahl sein? = ");
        int grenze = scan.nextInt();
        int zufallszahl = (int) (Math.random() * grenze);

        System.out.print("Ihr Tipp = ");
        int tipp = scan.nextInt();

        if (zufallszahl == tipp) {
            System.out.println("GLÜCKWUNSCH!");
        } else {
            System.out.println("VIELLEICHT NÄCHSTES MAL, meine Zahl war " + zufallszahl);
        }

        // Teil 2: Zufallszahl innerhalb eines benutzerdefinierten Bereichs
        System.out.print("Geben Sie das Minimum ein = ");
        int min = scan.nextInt();
        System.out.print("Geben Sie das Maximum ein = ");
        int max = scan.nextInt();

        int zufallszahlZwischen = (int) (Math.random() * (max - min + 1)) + min;
        System.out.printf("Meine Zufallszahl zwischen %d und %d ist %d", min, max, zufallszahlZwischen);
    }
}
