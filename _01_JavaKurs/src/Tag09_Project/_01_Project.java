package Tag09_Project;

import java.util.Scanner;

public class _01_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zufallszahl = (int) (Math.random() * 90) + 10;
        int versuche = 0;
        //System.out.println("Zufallszahl = " + zufallszahl);
        System.out.println("Schwierigkeitsgrad:");
        System.out.println("------------------");
        System.out.println("Wählen Sie E für EINFACH");
        System.out.println("Wählen Sie N für NORMAL");
        System.out.println("Wählen Sie S für SCHWIERIG");
        System.out.println("------------------");
        System.out.print("Geben Sie Ihre Wahl ein = ");
        String wahl = scanner.next();

        switch (wahl.toUpperCase()) {
            case "E":
                System.out.println("Sie können 10 Mal versuchen, Viel Glück!");
                versuche = 10;
                break;
            case "N":
                System.out.println("Sie können 7 Mal versuchen, Viel Glück!");
                versuche = 7;
                break;
            case "S":
                System.out.println("Sie können 5 Mal versuchen, Viel Glück!");
                versuche = 5;
                break;
            default:
                System.out.println("Sie haben E, N oder S nicht eingegeben.");
                break;
        }
        for (int i = 0; i < versuche; i++) {
            System.out.print("Geben Sie Ihre Schätzung zwischen 10 und 100 ein = ");
            int schaetzung = scanner.nextInt();
            if (schaetzung > zufallszahl) {
                System.out.println("Sie sollten eine kleinere Zahl eingeben");
            } else{
                if (schaetzung < zufallszahl) {
                    System.out.println("Sie sollten eine größere Zahl eingeben");
                } else {
                    System.out.println("HERZLICHEN GLÜCKWUNSCH! Sie haben die Zahl gefunden.");
                    System.out.println("Sie haben die Zahl im " + (i + 1) + ". Versuch gefunden" );
                    break;
                }
            }
            if ((versuche - i - 1) != 0)
                System.out.println("Sie können noch " + (versuche - i - 1) +" Mal versuchen");
            if ((versuche - i - 1) == 0){
                System.out.println("Entschuldigung! Sie haben " + (i + 1) + " Mal versucht, aber Sie haben die Zahl nicht gefunden.");
                System.out.println("Meine Zahl ist =" + zufallszahl);
            }
        }
    }
}
