package Tag05;

import java.util.Scanner;

public class _06_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie einen Satz ein = ");

        String satz = scanner.nextLine();
        int laenge = satz.length();
        char letztesZeichen = satz.charAt(laenge - 1);

        System.out.println("Das letzte Zeichen ist = " + letztesZeichen);
    }
}
