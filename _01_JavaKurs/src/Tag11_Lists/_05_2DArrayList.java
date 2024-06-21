package Tag11_Lists;

import java.util.ArrayList;

public class _05_2DArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();              // normale Liste, einzeilig

        ArrayList<ArrayList<Integer>> tabelle = new ArrayList<>();   // 2D-Liste, mehrzeilig

        ArrayList<Integer> matheNoten = new ArrayList<>();            // alle sind separate Listen
        ArrayList<Integer> physikNoten = new ArrayList<>();
        ArrayList<Integer> chemieNoten = new ArrayList<>();

        matheNoten.add(50); matheNoten.add(70); matheNoten.add(80);
        physikNoten.add(40); physikNoten.add(60);
        chemieNoten.add(90); chemieNoten.add(50); chemieNoten.add(60); chemieNoten.add(87);

        /************************/

        ArrayList<ArrayList<Integer>> notenListe = new ArrayList<>();

        notenListe.add(matheNoten);                    // Erste Zeile zur 2D-Liste hinzufügen
        notenListe.add(physikNoten);                    // Zweite Zeile hinzufügen
        notenListe.add(chemieNoten);                    // Dritte Zeile hinzufügen

        matheNoten.get(0);                        // Gibt das erste Element von matheNoten zurück

        notenListe.get(0).get(0);                // Gibt das erste Element der ersten Liste in notenListe zurück
        // also das erste Element von matheNoten
        notenListe.get(0).add(67);

        for (int i = 0; i < notenListe.size(); i++) {
            for (int j = 0; j < notenListe.get(i).size(); j++) {
                System.out.print(notenListe.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}
