package Tag05;

import java.util.Scanner;

public class _05_Frage {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerBool = new Scanner(System.in);

        System.out.print("Geben Sie Ihre Straße ein = ");
        String strasse = scannerString.nextLine();
        System.out.print("Geben Sie Ihre Stadt ein = ");
        String stadt = scannerString.nextLine();
        System.out.print("Geben Sie Ihre Postleitzahl ein = ");
        int postleitzahl = scannerInt.nextInt();
        System.out.print("Geben Sie Ihr Land ein = ");
        String land = scannerString.nextLine();
        System.out.print("Geben Sie True oder False ein, ob Sie Eigentümer sind oder nicht = ");
        boolean eigentuemer = scannerBool.nextBoolean();

        System.out.println("Ihre Adresse lautet " + strasse + " " + stadt + " " + postleitzahl + " " +
                land + " Sind Sie ein Eigentümer? " + eigentuemer);
    }
}
