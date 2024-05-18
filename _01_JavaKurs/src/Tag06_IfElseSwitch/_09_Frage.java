package Tag06_IfElseSwitch;

import java.util.Scanner;

public class _09_Frage {
    public static void main(String[] args) {
        // den Namen des Tages basierend auf der eingegebenen Nummer anzeigen
        Scanner scan = new Scanner(System.in);
        System.out.print("Nummer des Tages = ");
        int tag = scan.nextInt();

        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ihre Nummer ist ungültig");
                break;
        }
    }
}
