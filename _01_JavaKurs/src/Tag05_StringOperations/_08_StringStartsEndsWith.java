package Tag05_StringOperations;

public class _08_StringStartsEndsWith {
    public static void main(String[] args) {
        // startsWith() -> Beginnt der String mit diesem Zeichen oder dieser Zeichenfolge?
        // Gibt einen boolean zurück

        String text = "Köln";

        System.out.println("Beginnt text mit K? " + text.startsWith("K")); //true
        System.out.println("Beginnt text mit Kö? " + text.startsWith("Kö")); //true
        System.out.println("Beginnt text mit ln? " + text.startsWith("ln")); //false

        // endsWith() -> Endet der String mit diesem Zeichen oder dieser Zeichenfolge?
        // Gibt einen boolean zurück

        System.out.println("Endet text mit n? " + text.endsWith("n")); //true
        System.out.println("Endet text mit ln? " + text.endsWith("ln")); //true
        System.out.println("Endet text mit K? " + text.endsWith("K")); //false
    }
}
