package Tag03;

public class _04_StringConversion {
    public static void main(String[] args) {
        String spende1 = "500";
        String spende2 = "700";

        System.out.println(spende1 + spende2); // Es schreibt 500700, wir müssen eine Konvertierung durchführen

        int spendenBetrag1 = Integer.parseInt(spende1);   // parse bedeutet bearbeiten und umwandeln
        int spendenBetrag2 = Integer.parseInt(spende2);   // ähnlich gibt es auch Double.parseDouble usw.

        int summe = spendenBetrag1 + spendenBetrag2;

        System.out.println(summe);

        // Wenn wir Zahlen in Strings umwandeln, verwenden wir valueOf
        int zahl = 56;
        String strZahl = String.valueOf(zahl);

        System.out.println("String Nummer = " + strZahl);
    }
}