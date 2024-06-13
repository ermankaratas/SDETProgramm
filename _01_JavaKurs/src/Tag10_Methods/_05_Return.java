package Tag10_Methods;

import java.util.Scanner;

public class _05_Return {
    public static void main(String[] args) {
        // Finde die größte Zahl aus zwei vorgegebenen Zahlen
        int groessteZahl = groessteZahlErmitteln(5, 6);
        System.out.println("Die größte Zahl = " + groessteZahl);

        // Finde die größte Zahl aus zwei vom Benutzer eingegebenen Zahlen
        int groessteZahl2 = groessteZahlErmitteln();
        System.out.println("Die größte Zahl = " + groessteZahl2);
    }

    // Methode, um die größere Zahl von zwei gegebenen Zahlen zu finden
    public static int groessteZahlErmitteln(int zahl1, int zahl2) {
        return (zahl1 > zahl2 ? zahl1 : zahl2);
    }

    // Methode, um die größere Zahl von zwei vom Benutzer eingegebenen Zahlen zu finden
    public static int groessteZahlErmitteln() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Geben Sie die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();
        return groessteZahlErmitteln(zahl1, zahl2);
    }
}
