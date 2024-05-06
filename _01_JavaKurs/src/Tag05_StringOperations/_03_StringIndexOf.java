package Tag05_StringOperations;

public class _03_StringIndexOf {
    public static void main(String[] args) {
        // IndexOf(Buchstaben) -> Gibt den Index der angegebenen Buchstaben zurück
        // -1 bedeutet, dass es nicht existiert
        // Um den zweiten Buchstaben zu finden, zum Beispiel, wenn es 2 "l"s gibt, würden wir die Suche an die Stelle
        // verschieben, an der wir den zweiten "l" finden (a,3) zum Beispiel
        // lastIndexOf -> Beginnt die Suche von hinten

        String satz = "Hallo Welt";
        // Index von "H" ist 0, "l" ist 2, "a" ist 1, "W" ist 6, "e" ist 7, "t" ist 10

        System.out.println("satz.indexOf(H) = " + satz.indexOf("H"));  //0
        System.out.println("satz.indexOf(a) = " + satz.indexOf("a"));  //1
        System.out.println("satz.indexOf(W) = " + satz.indexOf("W"));  //6
        System.out.println("satz.indexOf( ) = " + satz.indexOf(" "));  //5
        System.out.println("satz.indexOf(Z) = " + satz.indexOf("Z"));  //-1

        System.out.println("satz.indexOf(l,3) = " + satz.indexOf("l", 3));  //3

        System.out.println("satz.lastIndexOf(l) = " + satz.lastIndexOf("l"));  //8
    }
}