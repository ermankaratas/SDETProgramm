package Tag06_IfElse;

import java.util.Scanner;

public class _02_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Note ein: ");
        int IhreNote = scanner.nextInt();

        if (IhreNote >= 50)
            System.out.println("Bestanden");
        else
            System.out.println("Nicht bestanden");
    }
}
