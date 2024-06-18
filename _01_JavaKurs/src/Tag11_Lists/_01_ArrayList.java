package Tag11_Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> stringListe = new ArrayList<>();
        ArrayList<Double> doubleListe = new ArrayList<>();

        ArrayList<String> namen = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 45, 6, 7));  // unterschiedliche Initialisierungsmethode
        ArrayList<Integer> list2 = new ArrayList<>(list1);  // Anstatt eines Arrays direkt eine Liste verwenden

        namen.add("Iris");
        namen.add("Iris");
        namen.add("Sven");

        System.out.println("namen = " + namen);
        System.out.println("namen.size gibt die Länge zurück = " + namen.size());

        namen.add(1, "Josephine");  // Einfügen, fügt ein Element an der angegebenen Position ein, die anderen verschieben sich nach rechts
        System.out.println("namen = " + namen);

        namen.set(2, "Joseph");  // Ändern, ändert das Element an der angegebenen Position
        System.out.println("namen = " + namen);

        boolean vorhanden = namen.contains("Joseph");  // Überprüfen, ob ein Element in der Liste enthalten ist
        System.out.println("vorhanden = " + vorhanden);

        namen.remove(1);  // Löschen, entfernt das Element an der angegebenen Position oder das erste Vorkommen des angegebenen Elements
        System.out.println("namen = " + namen);

        int indexVonIris = namen.indexOf("Iris");  // Gibt den Index des ersten Vorkommens des angegebenen Elements zurück
        System.out.println("index von Iris = " + indexVonIris);

        String erstesElement = namen.get(0);  // Gibt das Element an der angegebenen Position zurück
        System.out.println("erstes Element = " + erstesElement);

        namen.clear();  // Liste leeren
        System.out.println("namen = " + namen);
    }
}
