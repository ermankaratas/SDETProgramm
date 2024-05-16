package Tag06_IfElseSwitch;

import java.util.Scanner;

public class _07_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein = ");
        int ersteZahl = scan.nextInt();
        System.out.print("Geben Sie eine Zahl ein = ");
        int zweiteZahl = scan.nextInt();

        System.out.println("EINGEBEN FÜR : ");
        System.out.println("------------");
        System.out.println("Addition A");
        System.out.println("Subtraktion S");
        System.out.println("Multiplikation M");
        System.out.println("Division D");
        System.out.println("------------");
        System.out.print("Ihre Wahl = ");
        scan.nextLine();
        String wahl = scan.nextLine().toUpperCase();

        switch (wahl){
            case "A" :
                System.out.println("Ergebnis der Addition = " + (ersteZahl + zweiteZahl));
                break;
            case "S" :
                System.out.println("Ergebnis der Subtraktion = " + (ersteZahl - zweiteZahl));
                break;
            case "M" :
                System.out.println("Ergebnis der Multiplikation = " + (ersteZahl * zweiteZahl));
                break;
            case "D" :
                System.out.println("Ergebnis der Division = " + ((double)ersteZahl / zweiteZahl));
                break;
            default:
                System.out.println("Ihre Wahl ist inkorrekt");
                break;
        }
    }
}
