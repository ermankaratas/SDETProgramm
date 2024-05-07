package Tag05_StringOperations;

public class _05_StringContains {
    public static void main(String[] args) {
        // contains -> Gibt an, ob die gesuchten Buchstaben im String vorhanden sind
        // Liefert das Ergebnis als boolean zurück

        String satz = "Hallo Welt";

        boolean vorhanden = satz.contains("a"); //true

        System.out.println("Gibt es ein 'a'? " + satz.contains("a")); //true
        System.out.println("Gibt es ein 'Ha'? " + satz.contains("Ha")); //true
        System.out.println("Gibt es ein 'z'? " + satz.contains("z")); //false
        System.out.println("Gibt es ein 'aü'? " + satz.contains("aü")); //false
    }
}