package Tag06_IfElseSwitch;

import java.util.Scanner;

public class _11_Frage {
    public static void main(String[] args) {
        // Anzahl der Tage eines Monats basierend auf der eingegebenen Monatsnummer ausgeben
        Scanner scan = new Scanner(System.in);
        System.out.print("Nummer des Monats = ");
        int monat = scan.nextInt();

        switch (monat) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Tage");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Tage");
                break;
            case 2:
                System.out.println("28 Tage");
                break;
            default:
                System.out.println("Ihre Eingabe ist ungültig");
        }
    }
}
