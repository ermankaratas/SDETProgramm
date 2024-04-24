package Tag03;

public class _05_Frage {
    public static void main(String[] args) {
        int zahl1 = 10;
        int zahl2 = 3;

        // Wenn ein int durch ein anderes int geteilt wird, kommt kein Bruchteil-Ergebnis, sondern ein int-Ergebnis heraus
        // deswegen muss mindestens einer davon DOUBLE sein
        int ergebnis = zahl1 / zahl2;
        System.out.println("ergebnis = " + ergebnis);

        // Um ein Ergebnis mit einem Bruchteil zu erhalten, muss mindestens einer von ihnen DOUBLE sein
        double doubleErgebnis = zahl1 / (double) zahl2;
        System.out.println("doubleErgebnis = " + doubleErgebnis);
    }

}
