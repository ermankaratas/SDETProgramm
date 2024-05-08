package Tag05_StringOperations;

public class _06_StringEquals {
    public static void main(String[] args) {
        // equals -> Vergleicht Strings miteinander
        // Das Ergebnis ist boolean

        // equalsIgnoreCase -> Groß- und Kleinschreibung wird ignoriert

        // isEmpty -> Überprüft, ob der String leer ist

        String s1 = "hallo";
        String s2 = "HALLO";
        String s3 = "";

        boolean istGleich = s1.equals(s2);

        System.out.println("Ist es gleich? " + istGleich); //false
        System.out.println("Ist es gleich? " + s1.equals("hallo")); //true

        System.out.println("Ist es gleich ohne Berücksichtigung der Groß- und Kleinschreibung? " + s1.equalsIgnoreCase("HALLO")); //true
        System.out.println("Ist es gleich ohne Berücksichtigung der Groß- und Kleinschreibung? " + s1.equalsIgnoreCase(s2)); //true

        System.out.println("Ist s3 leer? " + s3.isEmpty()); //true
        System.out.println("Ist s2 leer? " + s2.isEmpty()); //false
    }
}