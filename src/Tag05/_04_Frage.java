package Tag05;

import java.util.Scanner;

public class _04_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sind Sie ein Student? Wenn ja, schreiben Sie True, andernfalls schreiben Sie False = ");
        boolean antwort = scanner.nextBoolean();
        System.out.println("Antwort = " + antwort);
    }
}
