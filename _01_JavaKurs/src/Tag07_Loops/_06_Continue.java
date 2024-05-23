package Tag07_Loops;

import java.util.Scanner;

public class _06_Continue {
    public static void main(String[] args) {
        // 1. Aufgabe: Benutzer zur Eingabe von 5 Zahlen auffordern und die Summe der Zahlen berechnen,
        // die nicht zwischen 6 und 10 (exklusiv) liegen
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("enter a number = ");
            int number = scanner.nextInt();
            if (number > 6 && number < 10) {
                continue;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);

        // 2. Aufgabe: Die Buchstaben eines Strings einzeln untereinander ausgeben, wobei Leerzeichen ignoriert werden
        scanner.nextLine(); // Scanner-Puffer leeren
        System.out.print("enter a sentence = ");
        String sentence = scanner.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (letter == ' ') {
                continue;
            }
            System.out.println("letter = " + letter);
        }

        // 3. Aufgabe: Multiplikationstabellen für die Zahlen von 1 bis 5 erstellen
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
