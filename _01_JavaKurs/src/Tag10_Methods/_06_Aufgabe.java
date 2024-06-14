package Tag10_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Aufgabe {
    public static void main(String[] args) {
        // 1-Erstellen Sie eine Methode namens **randomNum**.
        // Die Methode sollte einen **int max** als Parameter nehmen.
        // Diese Methode sollte eine Zufallszahl zwischen 0 und max zurückgeben.
        // Geben Sie die Zufallszahl zurück.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine maximale Zahl ein: ");
        int max = scanner.nextInt();
        System.out.println("Zufallswert ist: " + zufallszahl(max));

        // 2-Erstellen Sie eine Methode namens "OrtaKelime".
        // Diese Methode sollte einen String als Parameter nehmen.
        // Diese Methode sollte das mittlere Wort in einem Satz finden und zurückgeben.
        // Beispiel: Ich liebe Java.
        // Ausgabe: liebe
        // Beispiel 2:
        // Ich lerne Java leicht.
        // Ausgabe: lerne
        scanner.nextLine();  // Konsumiert die verbleibende neue Zeile
        System.out.print("Geben Sie einen Satz ein: ");
        String satz = scanner.nextLine();
        System.out.println("Das mittlere Wort ist: " + mittleresWort(satz));

        // 3-Erstellen Sie eine Methode namens reverseString.
        // Diese Methode sollte einen String als Parameter nehmen.
        // Diese Methode sollte den gegebenen String umkehren.
        // Geben Sie die umgekehrte Version des Strings aus.
        // Beispiel: String = "Ich liebe Java."
        // Ausgabe: .avaJ evil I
        System.out.println("Der umgekehrte Satz ist: " + umgekehrterString(satz));

        // 4-Erstellen Sie eine Methode namens reverseWord.
        // Diese Methode sollte einen String als Parameter haben.
        // Diese Methode sollte die Wörter im Satz umkehren.
        // Beispiel 1:
        // Satz: Ich lerne Java.
        // Ausgabe: Java lerne Ich
        System.out.println("Die umgekehrten Wörter sind: " + umgekehrteWorte(satz));

        // 5-Erstellen Sie eine Methode namens append.
        // Diese Methode sollte zwei int-Arrays als Parameter nehmen.
        // Die Methode sollte ein neues Array zurückgeben, das die Werte des zweiten Arrays
        // an das Ende des ersten Arrays anhängt.
        // Beispiel: erstes Array {2, 4, 6} und zweites Array {1, 2, 3, 4, 5}
        // Ausgabe: {2, 4, 6, 1, 2, 3, 4, 5}
        int[] erstesArray = {2, 4, 6};
        int[] zweitesArray = {1, 2, 3, 4, 5};
        System.out.println("Zusammengefügtes Array: " + Arrays.toString(anhaengen(erstesArray, zweitesArray)));
    }

    public static int zufallszahl(int max) {
        return (int) (Math.random() * max);
    }

    public static String mittleresWort(String satz) {
        String[] satzArray = satz.split(" ");
        int mitte = satzArray.length / 2;
        return satzArray[mitte];
    }

    public static String umgekehrterString(String satz) {
        char[] buchstaben = satz.toCharArray();
        String umgekehrterSatz = "";
        for (int i = buchstaben.length - 1; i >= 0; i--) {
            umgekehrterSatz += buchstaben[i];
        }
        return umgekehrterSatz;
    }

    public static String umgekehrteWorte(String satz) {
        String[] satzArray = satz.split(" ");
        String umgekehrterSatz = "";
        for (int i = satzArray.length - 1; i >= 0; i--) {
            umgekehrterSatz += satzArray[i] + " ";
        }
        return umgekehrterSatz.trim();
    }

    public static int[] anhaengen(int[] erstesArray, int[] zweitesArray) {
        int[] zusammengefuegtesArray = new int[erstesArray.length + zweitesArray.length];
        System.arraycopy(erstesArray, 0, zusammengefuegtesArray, 0, erstesArray.length);
        System.arraycopy(zweitesArray, 0, zusammengefuegtesArray, erstesArray.length, zweitesArray.length);
        return zusammengefuegtesArray;
    }
}
