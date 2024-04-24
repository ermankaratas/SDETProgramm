package Tag03;

public class _02_WideningCasting {
    public static void main(String[] args) {
        int zahl = 9;
        long summe = 500;
        double rate = 3.2;

        rate = zahl; // int -> double Richtung der Erweiterung, keine Möglichkeit für Datenverlust
        System.out.println("rate = " + rate);

        summe = zahl;
        System.out.println("summe = " + summe);

        rate = summe;
        System.out.println("rate = " + rate);
    }
}
