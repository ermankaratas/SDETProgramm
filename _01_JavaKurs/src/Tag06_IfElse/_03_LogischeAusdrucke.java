package Tag06_IfElse;

import java.util.Scanner;

public class _03_LogischeAusdrucke {
    public static void main(String[] args) {
        // Logische Ausdrücke
        // und    ->  &&
        // oder   ->  ||

        // Wenn eine Zahl eingegeben wird, die größer als 0 und kleiner oder gleich 100 ist,
        // dann ist sie eine gültige Note, ansonsten ist sie ungültig.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie Ihre Note ein: ");
        int note = scanner.nextInt();
        if (0 < note && note <= 100)
            System.out.println("BESTANDEN");
        else
            System.out.println("NICHT BESTANDEN");
    }
}
