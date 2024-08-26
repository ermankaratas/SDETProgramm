package Tag12_Sets;

import java.util.TreeSet;

public class _06_Frage {
    public static void main(String[] args) {
        // Generiere 10 einzigartige Zufallszahlen von 1 bis 20 (einschließlich)
        // und speichere sie in einem TreeSet, um Duplikate zu vermeiden

        TreeSet<Integer> ts = new TreeSet<>();
        while (ts.size() < 10) {
            ts.add(randomNumber(20));
        }
        System.out.println("ts = " + ts);
    }

    // Generiere eine Zufallszahl von 1 bis maxNumber (einschließlich)
    public static int randomNumber(int maxNumber) {
        return (int) (Math.random() * (maxNumber + 1));
    }
}
