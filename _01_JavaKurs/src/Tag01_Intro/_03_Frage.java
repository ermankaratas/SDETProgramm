package Tag01_Intro;

public class _03_Frage {
    public static void main(String[] args) {
        int spenden1 = 500, spenden2 = 1000;
        int summe = spenden1 + spenden2;
        System.out.println("Summe der Spenden = " + summe + " €");

        double gewicht = 74.2, grosse = 1.70;
        double bmi = gewicht / (grosse * grosse);
        System.out.println("Ihr Gewicht = " + gewicht + " und Ihre Größe = " + grosse);
        System.out.println("Body-Mass-Index = " + bmi);
    }
}
