package Tag08_Arrays;

import java.util.Scanner;

public class _02_Frage {
    public static void main(String[] args) {
        // Geben Sie die Noten für eine Klasse mit 5 Schülern ein
        // und finden Sie heraus, wie viele Noten größer als der Durchschnitt sind
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[5];
        int sum = 0;
        int j = 0;

        for (int i = 0; i < notes.length; i++) {
            System.out.print((i + 1 ) + ". Note eingeben = ");
            notes[i] = scanner.nextInt();
            sum += notes[i];
        }
        int avg = sum / notes.length;
        System.out.println("Noten über dem Durchschnitt :");
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > avg) {
                System.out.println(notes[i]);
                j++;
            }
        }
        System.out.println("Insgesamt " + j +" Noten sind größer als der Durchschnitt");
    }
}
