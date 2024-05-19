package Tag06_IfElseSwitch;

import java.util.Scanner;

public class _10_Frage {
    public static void main(String[] args) {
        // den Wert der Einerstelle einer eingegebenen Zahl als Text ausgeben
        // 234 -> Einerstelle 4 -> vier
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein = ");
        int zahl = scan.nextInt();
        int letzteZahl = zahl % 10;

        switch (letzteZahl) {
            case 0:
                System.out.println("Null");
                break;
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            case 3:
                System.out.println("Drei");
                break;
            case 4:
                System.out.println("Vier");
                break;
            case 5:
                System.out.println("Fünf");
                break;
            case 6:
                System.out.println("Sechs");
                break;
            case 7:
                System.out.println("Sieben");
                break;
            case 8:
                System.out.println("Acht");
                break;
            case 9:
                System.out.println("Neun");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
    }
}
