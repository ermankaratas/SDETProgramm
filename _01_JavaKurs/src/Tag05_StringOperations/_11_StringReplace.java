package Tag05_StringOperations;

public class _11_StringReplace {
    public static void main(String[] args) {
        // replace() -> Ersetzt alle Vorkommen eines Zeichens oder einer Zeichenfolge in einem String durch einen anderen Wert
        // replaceFirst() -> Ersetzt nur das erste Vorkommen eines Zeichens oder einer Zeichenfolge in einem String durch einen anderen Wert
        // replaceAll("[]","") -> Ersetzt mehrere verschiedene Zeichen oder Zeichenfolgen in einem String durch einen anderen Wert

        String text = "Hallo Welt";
        System.out.println("text.replace(a,e) = " + text.replace("a", "e")); //Hello Welt
        System.out.println("text.replace(ba,de) = " + text.replace("ba", "de")); //Hallo Welt (keine Änderung, da "ba" nicht vorhanden ist)
        System.out.println("text.replace(a,aaa) = " + text.replace("a", "aaa")); //Haaallo Welt
        System.out.println("text.replace(a,'') = " + text.replace("a", "")); //Hllo Welt

        String text2 = "Hallo12 Welt34";
        System.out.println("abn -> = " + text2.replaceAll("[abn]", "")); //Hllo12 Welt34
        System.out.println("123 -> = " + text2.replaceAll("[123]", "")); //Hallo Welt4
        System.out.println("0-9 -> = " + text2.replaceAll("[0-9]", "")); //Hallo Welt
        System.out.println("a-z -> = " + text2.replaceAll("[a-z]", "")); //H12 W34
        System.out.println("abn -> = " + text2.replaceAll("[^0-9]", "")); //1234

        System.out.println("text2.replaceAll([A-Z,a-z],) = " + text2.replaceAll("[A-Z,a-z]", "")); //12 34
    }

}
