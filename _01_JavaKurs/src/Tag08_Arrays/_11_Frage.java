package Tag08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Frage {
    public static void main(String[] args) {
        // Füllen Sie eine 3x2-Matrix mit Benutzereingaben
        // und kopieren Sie dann nur die ungeraden Elemente in ein eindimensionales Array.

        int[][] tabelle = new int[3][2];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++){
                System.out.print("Geben Sie eine Zahl ein = ");
                tabelle[i][j] = scanner.nextInt();
                if (tabelle[i][j] % 2 == 1)
                    sum++;
            }
        }
        int[] tabelleX = new int[sum];
        int k = 0;
        for (int i = 0; i < tabelle.length; i++) {
            for (int j = 0; j < tabelle[i].length ; j++){
                if (tabelle[i][j] % 2 == 1) {
                    tabelleX[k] = tabelle[i][j];
                    k++;
                }
            }
        }
        System.out.println("Array = " + Arrays.toString(tabelleX));

    }
}
