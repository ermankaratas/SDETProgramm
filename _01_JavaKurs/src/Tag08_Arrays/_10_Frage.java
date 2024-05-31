package Tag08_Arrays;

import java.util.Scanner;

public class _10_Frage {
    public static void main(String[] args) {
        // Fülle eine 2x5 Tabelle mit Zufallszahlen von 0 bis 99.
        // Zähle anschließend, wie viele ungerade Zahlen es gibt.

        int[][] tabelle = new int[2][5];
        int summe = 0;
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++)
                tabelle[i][j] = (int) (Math.random()*100);
        }
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++)
                if (tabelle[i][j] % 2 == 1)
                    summe++;
        }
        System.out.println("Anzahl der ungeraden Zahlen = " + summe);

        // Fülle eine 2x5 Tabelle mit Zufallszahlen von 0 bis 9.
        // Fordere dann den Benutzer auf, eine Zahl einzugeben. Falls diese
        // in der Tabelle vorhanden ist, gebe ihre Position (Zeile, Spalte) aus.

        System.out.println("Tabelle =");
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++)
                System.out.print(tabelle[i][j] + " ");
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein = ");
        int benutzerZahl = scanner.nextInt();
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++)
                if (tabelle[i][j] == benutzerZahl)
                    System.out.println("Zeile = " + (i + 1) + " Spalte = " + (j + 1) );
        }
    }
}
