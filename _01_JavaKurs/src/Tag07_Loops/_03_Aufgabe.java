package Tag07_Loops;

import java.util.Scanner;

public class _03_Aufgabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

// 1. Finden Sie die Summe der ungeraden Zahlen unter den 20 vom Benutzer eingegebenen Zahlen
        int count = 0;
        int oddCount = 0;
        int oddSum = 0;
        int rangeSum = 0;

        while (count < 20) {
            System.out.print("Geben Sie eine Zahl ein: ");
            int number = scan.nextInt();

            // Summe der ungeraden Zahlen
            if (number % 2 == 1) {
                oddSum += number;
                oddCount++;
            }

            // Summe der Zahlen im Bereich 10-30
            if (number > 10 && number < 30) {
                rangeSum += number;
            }

            count++;
        }
        System.out.println("Summe der ungeraden Zahlen: " + oddSum);

// 2. Zählen Sie, wie viele der 20 vom Benutzer eingegebenen Zahlen ungerade sind
        System.out.println("Anzahl der ungeraden Zahlen: " + oddCount);

// 3. Finden Sie die Summe der Zahlen bis zu einer vom Benutzer eingegebenen Zahl
        System.out.print("Geben Sie die Anzahl der zu summierenden Zahlen ein: ");
        int n = scan.nextInt();
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Geben Sie eine Zahl ein: ");
            int number = scan.nextInt();
            totalSum += number;
        }
        System.out.println("Summe der eingegebenen Zahlen: " + totalSum);

// 4. Finden Sie die Summe der Zahlen im Bereich 10-30 unter den 20 vom Benutzer eingegebenen Zahlen
        System.out.println("Summe der Zahlen im Bereich 10-30: " + rangeSum);

// 5. Zählen Sie, wie viele der Zahlen bis 100 auf 5 enden
        int endWith5Count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 5) {
                endWith5Count++;
            }
        }
        System.out.println("Anzahl der Zahlen, die auf 5 enden: " + endWith5Count);

// 6. Ein Zahlenspiel, bei dem der Benutzer versucht, eine zufällig gewählte Zahl zwischen 10 und 20 zu erraten
        int randomNumber = (int) (Math.random() * 11) + 10;
        boolean guessedCorrectly = false;

        for (int i = 0; i < 3; i++) {
            System.out.print("Raten Sie die Zahl: ");
            int guess = scan.nextInt();

            if (guess == randomNumber) {
                System.out.println("Glückwunsch! Meine Zahl war: " + randomNumber);
                guessedCorrectly = true;
                break;
            } else {
                System.out.println("Versuchen Sie es erneut.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Leider haben Sie die Zahl nicht erraten. Meine Zahl war: " + randomNumber);
        }
    }
}
