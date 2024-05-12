package Tag05_StringOperations;

public class _10_StringTrim {
    public static void main(String[] args) {
        // trim() -> Entfernt führende und abschließende Leerzeichen aus dem String

        String text = "                Iris                  ";
        System.out.println("text =  ->" + text + "<-");
        System.out.println("text =  ->" + text.trim() + "<-");
    }
}