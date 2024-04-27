package Tag05;

import java.util.Scanner;

public class _01_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Länge der langen Seite ein = ");
        int langeSeite = scanner.nextInt();
        System.out.print("Geben Sie die Länge der kurzen Seite ein = ");
        int kurzeSeite = scanner.nextInt();

        int umfang = 2 * (kurzeSeite + langeSeite);
        int flaeche = langeSeite * kurzeSeite;

        System.out.println("Umfang = " + umfang);
        System.out.println("Fläche = " + flaeche);
    }
}
