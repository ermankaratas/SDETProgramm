package Tag04;

import java.util.Scanner;

public class _04_Aufgabe {
    public static void main(String[] args) {
        Scanner scannerString = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);

        //1- Erstellen Sie einen String. Geben Sie Ihren Namen in die Konsole ein. Drucken Sie Ihren Namen.
        System.out.print("Ihr Name = ");
        String name = scannerString.nextLine();
        System.out.println("Ihr Name = " + name);

        //2- Erstellen Sie eine ganze Zahl. Geben Sie eine beliebige Zahl in die Konsole ein. Drucken Sie diese Zahl.
        System.out.print("Geben Sie eine Zahl ein = ");
        int zahl = scannerInt.nextInt();
        System.out.println("Zahl = " + zahl);

        //3- Erstellen Sie einen String. Geben Sie Ihre Lieblingsfrucht in die Konsole ein. Drucken Sie diese Frucht.
        System.out.print("Ihre Lieblingsfrucht = ");
        String frucht = scannerString.nextLine();
        System.out.println("Ihre Lieblingsfrucht ist " + frucht);

        //4- Erstellen Sie eine Integer-Zahl. Geben Sie die Anzahl der Türen in Ihrem Auto in die Konsole ein. Drucken Sie diese Integer-Zahl.
        System.out.print("Geben Sie die Anzahl der Türen in Ihrem Auto ein = ");
        int anzahlDerTueren = scannerInt.nextInt();
        System.out.println("Anzahl der Türen in Ihrem Auto beträgt " + anzahlDerTueren);

        //5- Erstellen Sie einen String. Geben Sie die Stadt ein, in der Sie vor 10 Jahren gelebt haben. Drucken Sie diesen String.
        System.out.print("Geben Sie die Stadt ein, in der Sie vor 10 Jahren gelebt haben = ");
        String stadt = scannerString.nextLine();
        System.out.println("Die Stadt, in der Sie vor 10 Jahren gelebt haben, ist " + stadt);

        //6- Erstellen Sie einen String. Geben Sie Ihr Geburtsdatum in die Konsole ein. Drucken Sie diesen String.
        System.out.print("Geben Sie Ihr Geburtsdatum ein = ");
        String geburtsdatum = scannerString.nextLine();
        System.out.println("Ihr Geburtsdatum ist " + geburtsdatum);

        //7- Erstellen Sie einen Boolean. Geben Sie in die Konsole "Haben Sie ein Bankkonto?". Wenn ja, geben Sie True ein, andernfalls geben Sie False ein. Drucken Sie diesen Boolean.
        Scanner scannerBool = new Scanner(System.in);
        System.out.print("Haben Sie ein Bankkonto? Wenn ja, geben Sie True ein, andernfalls geben Sie False ein = ");
        boolean konto = scannerBool.nextBoolean();
        System.out.println("Konto = " + konto);

        //8- Erstellen Sie eine Integer-Zahl. Geben Sie ein Gewicht in kg in die Konsole ein. Drucken Sie diese Integer-Zahl.
        Scanner scannerByte = new Scanner(System.in);
        System.out.print("Geben Sie ein Gewicht in kg ein = ");
        byte gewicht = scannerByte.nextByte();
        System.out.println("Gewicht in kg = " + gewicht);

        //9- Erstellen Sie eine Kommazahl. Geben Sie Ihre Größe in die Konsole ein. Drucken Sie diese Kommazahl.
        Scanner scannerFloat = new Scanner(System.in);
        System.out.print("Geben Sie Ihre Größe ein = ");
        float groesse = scannerFloat.nextFloat();
        System.out.println("Ihre Größe beträgt " + groesse);

        //10- Drucken Sie die 4 Operationen(Summe, Differenz, Multiplikation, Division) der beiden vom Benutzer gegebenen Zahlen.
        System.out.print("Geben Sie eine Zahl ein = ");
        int zahl1 = scannerInt.nextInt();
        System.out.print("Geben Sie eine andere Zahl ein = ");
        int zahl2 = scannerInt.nextInt();
        System.out.println("Summe = " + (zahl1 + zahl2));
        System.out.println("Differenz = " + (zahl1 - zahl2));
        System.out.println("Multiplikation = " + (zahl1 * zahl2));
        System.out.println("Division = " + (zahl1 / zahl2));

        //11- Drucken Sie den Durchschnitt von 3 Schülernoten, die der Benutzer gibt.
        System.out.print("Geben Sie die erste Note ein = ");
        int note1 = scannerInt.nextInt();
        System.out.print("Geben Sie die zweite Note ein = ");
        int note2 = scannerInt.nextInt();
        System.out.print("Geben Sie die Abschlussnote ein = ");
        int note3 = scannerInt.nextInt();
        double durchschnitt = ((double) note1 + note2 + note3) / 3;
        System.out.println("Durchschnitt Ihrer Noten = " + durchschnitt);
    }
}