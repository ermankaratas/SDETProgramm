package Tag05_StringOperations;

public class _07_SubString {
    public static void main(String[] args) {
        // substring -> Extrahiert einen Teil des Strings
        // Wenn nur ein Parameter übergeben wird, wird ab diesem Index bis zum Ende des Strings extrahiert

        String s1 = "Hallo Java-Liebhaber";

        String teil1 = s1.substring(3, 9); // Beginne bei Index 3 und gehe bis Index 9, der nicht inklusive ist

        System.out.println("Teil 1 = " + teil1); // lo Jav

        System.out.println("Teil 2 = " + s1.substring(3)); // lo Java-Liebhaber
    }
}