package Tag05_StringOperations;

public class _13_Aufgabe {
    public static void main(String[] args) {
        // 1- Erstelle einen String "I love java".
        // Drucke die Gesamtanzahl der Zeichen in diesem Satz.
        String text1 = "I love java";
        text1 = text1.replace(" ", "");
        int laenge1 = text1.length();
        System.out.println("Länge = " + laenge1);

        // 2- Erstelle einen String "Sprint planning".
        // Drucke die Gesamtanzahl der Zeichen in diesem Satz.
        String text2 = "Sprint planning";
        text2 = text2.replace(" ", "");
        int laenge2 = text2.length();
        System.out.println("Länge2 = " + laenge2);

        // 3- Erstelle einen String "apple".
        // Überprüfe, ob der String "app" in diesem String vorkommt.
        String text3 = "apple";
        boolean enthaeltApp = text3.contains("app");
        System.out.println("Enthält 'app'? " + enthaeltApp);

        // 4- Erstelle einen String "orange".
        // Überprüfe, ob dieser String "Apple" entspricht.
        String text4 = "orange";
        boolean istGleichApple = text4.equals("Apple");
        System.out.println("Ist 'orange' gleich 'Apple'? " + istGleichApple);

        // 5- Erstelle einen String "apple".
        // Überprüfe, ob dieser String "apple" entspricht.
        String text5 = "apple";
        boolean istGleichApple2 = text5.equalsIgnoreCase("APPLE");
        System.out.println("Ist 'apple' gleich 'APPLE'? " + istGleichApple2);

        // 6- Erstelle einen String "Florida".
        // Drucke den Index, an dem nur der Buchstabe 'o' in "Florida" vorkommt.
        String text6 = "Florida";
        int indexVonO = text6.indexOf("o");
        System.out.println("Index von 'o' = " + indexVonO);

        // 7- Erstelle einen String "Thank you".
        // Drucke die Position des Buchstabens 'y' im String "Thank you".
        String text7 = "Thank you";
        int indexVonY = text7.indexOf("y");
        System.out.println("Index von 'y' = " + indexVonY);

        // 8- Erstelle einen String "Mouse".
        // Drucke das Zeichen an der 3. Stelle des Strings "Mouse".
        String text8 = "Mouse";
        char zeichen3 = text8.charAt(2);
        System.out.println("Zeichen 3 = " + zeichen3);

        // 9- Erstelle einen String "paper".
        // Konvertiere den String in Großbuchstaben und drucke ihn aus.
        String text9 = "paper";
        text9 = text9.toUpperCase();
        System.out.println("In Großbuchstaben = " + text9);

        // 10- Erstelle einen String "OraNge".
        // Konvertiere den String in Kleinbuchstaben und drucke ihn aus.
        String text10 = "OraNge";
        text10 = text10.toLowerCase();
        System.out.println("In Kleinbuchstaben = " + text10);

        // 11- Erstelle einen String "New Jersey".
        // Konvertiere den String in Großbuchstaben und drucke ihn aus.
        String text11 = "New Jersey";
        text11 = text11.toUpperCase();
        System.out.println("In Großbuchstaben = " + text11);

        // 12- Erstelle einen String "New York".
        // Konvertiere den String in Kleinbuchstaben und drucke ihn aus.
        String text12 = "New York";
        text12 = text12.toLowerCase();
        System.out.println("In Kleinbuchstaben = " + text12);

        // 13- Erstelle einen String "PADDLE".
        // Konvertiere den String in Kleinbuchstaben und drucke ihn aus.
        String text13 = "PADDLE";
        text13 = text13.toLowerCase();
        System.out.println("In Kleinbuchstaben = " + text13);
    }
}
