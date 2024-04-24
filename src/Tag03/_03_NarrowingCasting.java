package Tag03;

public class _03_NarrowingCasting {
    public static void main(String[] args) {
        int summe = 6700;
        byte zahl = 5;

        // Zahl = Summe; // Wenn wir int -> byte schreiben, gibt es einen Datenverlust kann auftreten
        zahl = (byte) summe;
        System.out.println("zahl = " + zahl); // Es wurde 44 geschrieben, also kam der richtige Wert nicht an
        // Daher ist es eine Situation, auf die man achten sollte, selbst wenn kein Datenverlust vorliegt
    }
}
