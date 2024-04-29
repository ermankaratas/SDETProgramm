package Tag03_Scanner;

import java.util.Scanner;

public class _02_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihren VorNamen und Ihren Namen ein = ");
        String name = scanner.nextLine();
        System.out.println("Ihr Vorname und Ihr Name = " + name);

        System.out.print("Geben Sie Ihren Vornamen ein = ");
        String vorname = scanner.next();
        System.out.print("Geben Sie Ihren Namen ein = ");
        String nachname = scanner.next();

        System.out.println("Ihr Vorname und Ihr Name = " + vorname + " " + nachname);

        Scanner scannerInt = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein = ");
        int zahl1 = scannerInt.nextInt();
        System.out.print("Geben Sie eine andere Zahl ein = ");
        int zahl2 = scannerInt.nextInt();

        System.out.println("Summe der Zahlen = " + (zahl1 + zahl2));

        System.out.print("Geben Sie die Länge des Feldes ein = ");
        int feld = scannerInt.nextInt();

        System.out.println("Der Umfang des Feldes beträgt " + (feld * 4));
    }
}