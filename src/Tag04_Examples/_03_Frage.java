package Tag04_Examples;

import java.util.Scanner;

public class _03_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihr Gewicht ein = ");
        double gewicht = scanner.nextDouble();
        System.out.print("Geben Sie Ihre Größe ein = ");
        double groesse = scanner.nextDouble();

        System.out.println("Ihre Größe beträgt " + groesse + " und Ihr Gewicht beträgt " + gewicht);
        System.out.println("Ihr Body-Mass-Index beträgt " + (gewicht / (groesse * groesse)));
    }
}
