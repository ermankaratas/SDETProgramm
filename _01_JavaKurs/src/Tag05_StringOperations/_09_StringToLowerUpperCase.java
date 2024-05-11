package Tag05_StringOperations;

public class _09_StringToLowerUpperCase {
    public static void main(String[] args) {
        // toLowerCase
        // toUpperCase

        String text = "Hallo Welt";
        System.out.println("text.toLowerCase() = " + text.toLowerCase());   // hallo welt
        System.out.println("text = " + text.toLowerCase().startsWith("h")); // true

        System.out.println("text.toUpperCase() = " + text.toUpperCase()); // HALLO WELT
    }
}