package Tag08_Arrays;

import java.util.Scanner;

public class _04_Split {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib deinen Satz ein = ");
        String satz = scanner.nextLine();

        String[] woerter = satz.split(" ");  // Teile den Satz an Leerzeichen auf und speichere die Elemente in einem Array
        System.out.println("Anzahl der Wörter = " + woerter.length);
        for (int i = 0; i < woerter.length ; i++)
            System.out.println("Wort = " + woerter[i]);
    }
}
