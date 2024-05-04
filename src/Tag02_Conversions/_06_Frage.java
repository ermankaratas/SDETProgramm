package Tag02_Conversions;

public class _06_Frage {
    public static void main(String[] args) {
        String note1 = "82";
        String note2 = "95";
        String note3 = "56";

        int zahlNote1 = Integer.parseInt(note1);
        int zahlNote2 = Integer.parseInt(note2);
        int zahlNote3 = Integer.parseInt(note3);

        int durchschnitt = (zahlNote1 + zahlNote2 + zahlNote3) / 3;

        System.out.println("Durchschnitt = " + durchschnitt);

        // Wenn die Dezimalstellen wichtig sind, reicht es aus, nur eine als DOUBLE zu definieren
        double durchschnittDouble = ((double) zahlNote1 + zahlNote2 + zahlNote3) / 3;

        System.out.println("durchschnittDouble = " + durchschnittDouble);
    }

}
