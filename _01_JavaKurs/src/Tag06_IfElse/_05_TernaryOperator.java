package Tag06_IfElse;

import java.util.Scanner;

public class _05_TernaryOperator {
    public static void main(String[] args) {
        // TernaryOperatör -> if => ? , else => :

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Zahl ein: ");
        int zahl = scanner.nextInt();

        String ergebnis = zahl == 0 ? "NULL" : (zahl > 0 ? "POSITIV" : "NEGATIV");
        System.out.println("Ergebnis: " + ergebnis);
    }
}
