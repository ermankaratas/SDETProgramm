package Tag01_Intro;

public class _01_Fluchtzeichen {
    /*
        Fluchtzeichen
               \n   -> Neue Zeile einfügen, zum nächsten Zeilenanfang springen
               \t   -> Als ob die Tab-Taste gedrückt wäre, erzeugt einen Leerzeichenbereich von 2, 3 Zeichen
               \b   -> Effekt des Zurücktaste, löscht also ein Zeichen zurück
               \"   -> Wird verwendet, um doppelte Anführungszeichen zu schreiben
               \\   -> Wird verwendet, um den Schrägstrich \ zu schreiben
               \r   -> Gehe zum Zeilenanfang
    */
    public static void main(String[] args) {
        System.out.println("HalloWelt");   //HalloWelt
        System.out.println("Hallo\nWelt");   //Hallo Neue Zeile Welt
        System.out.println("Hallo\tWelt");   //Hallo   Welt
        System.out.println("Hallo\bWelt");   //HalloWelt
        System.out.println("Hallo\"Welt");   //Hallo"Welt
        System.out.println("Hallo\\Welt");   //Hallo\Welt
        System.out.println("Hallo\rWelt");   //Welt

    }
}
