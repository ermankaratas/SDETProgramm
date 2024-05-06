package Tag05_StringOperations;

public class _04_StringConcat {
    public static void main(String[] args) {
        // concat -> Verbindet einen String mit einem anderen
        // Wir verwenden concat anstelle von +

        String s1 = "Hallo";
        String s2 = "Welt";

        System.out.println("Zusammengesetzte Version = " + s1 + s2);

        System.out.println("Zusammengesetzte Version = " + s1.concat(s2));
        System.out.println("Zusammengesetzte Version = " + s1.concat(" ").concat(s2));
        System.out.println("Zusammengesetzte Version = " + s1.concat(" " + s2));
    }
}