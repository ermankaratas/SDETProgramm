package Tag04;

import java.util.Scanner;

public class _01_Scanner {
    public static void main(String[] args) {

        int zahl = 5;

        Scanner scanner = new Scanner(System.in);  //von der Tastatur lesen

        // scanner.nextInt(); Mit diesem Befehl erwarten wir eine Eingabe einer Zahl

        System.out.print("Zahl eingeben = ");
        int eingegebeneZahl = scanner.nextInt();

        System.out.println("Eingegebene Zahl = " + eingegebeneZahl);
        System.out.println("Ende");

        //Einlesen von Wörtern, für String
        Scanner scannerStr = new Scanner(System.in);

        System.out.print("Geben Sie Ihren Namen ein = ");
        String name = scannerStr.next();             //wenn nur ein Wort, für ganze Zeile nextLine() verwenden
        System.out.println("Ihr Name = " + name);

        /*
        scanner.next();
        scanner.nextLine();

        scanner.nextInt();
        scanner.nextShort();
        scanner.nextByte();
        scanner.nextLong();

        scanner.nextFloat();
        scanner.nextDouble();

        scanner.nextBoolean();
         */
    }
}