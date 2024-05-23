package Tag07_Loops;

import java.util.Scanner;

public class _05_For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Aufgabe: Zahlen von 1 bis 5 ausgeben
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("counter = " + counter);
        }

        // 2. Aufgabe: Die Summe von fünf eingegebenen Ganzzahlen berechnen und ausgeben
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("enter a number = ");
            int number = scan.nextInt();
            total += number;
        }

        System.out.println("total = " + total);
    }
}
