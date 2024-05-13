package Tag06_IfElse;

import java.util.Scanner;

public class _01_If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein = ");
        int ersteZahl = scanner.nextInt();

        if (ersteZahl > 10)
            System.out.println("Größer als 10");
    }
}