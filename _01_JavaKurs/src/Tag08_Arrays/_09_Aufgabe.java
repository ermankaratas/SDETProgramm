package Tag08_Arrays;

import java.util.Arrays;

public class _09_Aufgabe {
    public static void main(String[] args) {
// 1. Einen String erstellen: "Entfernt Leerzeichen am Anfang und am Ende eines Strings"
//    Die Anzahl der Wörter im String ausgeben.
        String satz = "Entfernt Leerzeichen am Anfang und am Ende eines Strings";
        String[] wörter = satz.split(" ");
        System.out.println("Anzahl der Wörter = " + wörter.length);
        System.out.println("--------------------------");

// 2. Einen String erstellen: "Hello World"
//    Den String rückwärts ausgeben und drucken.
//    _Ergebnis sollte so sein:  "dlroW olleH"_
        String halloWelt = "Hello World";
        String[] buchstaben = new String[halloWelt.length()];
        for (int i = 0; i < halloWelt.length(); i++) {
            buchstaben[i] = String.valueOf(halloWelt.charAt(i));
        }
        for (int i = buchstaben.length - 1; i >= 0; i--) {
            System.out.print(buchstaben[i]);
        }
        System.out.println();
        System.out.println("--------------------------");

        // 3. Erstelle ein int-Array mit den Elementen: 25, 30, 30, 35, 100
//    Gib die Summe der Elemente des Arrays aus.
//    Das Ergebnis sollte 220 sein.
        int[] zahlen = {25, 30, 30, 35, 100};
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++)
            summe += zahlen[i];
        System.out.println("Summe = " + summe);
        System.out.println("--------------------------");

// 4. Erstelle ein int-Array.
//    Die Elemente sind: 13, 15, 14, 16, 16
//    Gib die Elemente des Arrays aus.
        int[] zahlen2 = {13, 15, 14, 16, 16};
        System.out.print("Elemente des Arrays = ");
        for (int i = 0; i < zahlen2.length; i++)
            System.out.print(zahlen2[i] + " ");
        System.out.println();
        System.out.println("--------------------------");

// 5. Erstelle ein String-Array mit den Elementen: "new jersey", "new york", "boston", "California"
//    Gib die Anzahl der Elemente im Array aus.
//    Das Ergebnis sollte 4 sein.
        String[] staedte = {"new jersey", "new york", "boston", "California"};
        System.out.println("Anzahl der Elemente im Array = " + staedte.length);
        System.out.println("--------------------------");

// 6. Erstelle ein String-Array.
//    Die Elemente sind: Apple, Orange, Banana, Kiwi
//    Gib alle Elemente des Arrays aus.
        String[] fruchte = {"Apple", "Orange", "Banana", "Kiwi"};
        System.out.print("Elemente des Arrays = ");
        for (int i = 0; i < fruchte.length; i++)
            System.out.print(fruchte[i] + " ");
        System.out.println();
        System.out.println("--------------------------");

// 7. Erstelle ein int-Array mit den Elementen: 12, 14, 21, 23, 10, 4
//    Berechne den Durchschnitt des Arrays.
        int[] zahlen3 = {12, 14, 21, 23, 10, 4};
        int summe2 = 0;
        for (int i = 0; i < zahlen3.length; i++)
            summe2 += zahlen3[i];
        double durchschnitt = (double) summe2 / zahlen3.length;
        System.out.println("Durchschnitt = " + durchschnitt);
        System.out.println("--------------------------");

// 8. Erstelle ein int-Array mit den Elementen: 5, 6, 8, 12, 14, 19
//    Addiere die geraden Zahlen und subtrahiere die ungeraden Zahlen.
//    **Beispiel:**
//    **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//    Gib die Summe aus.
        int[] zahlen4 = {5, 6, 8, 12, 14, 19};
        int summe4 = 0;
        for (int i = 0; i < zahlen4.length; i++) {
            if (zahlen4[i] % 2 == 1)
                summe4 -= zahlen4[i];
            else
                summe4 += zahlen4[i];
        }
        System.out.println("Summe = " + summe4);
        System.out.println("--------------------------");

// 9. Erstelle ein int-Array mit den Elementen: 15, 25, 22, 18, 30
//    Schreibe ein Programm, das das zweitgrößte Element im Array ausgibt.
        int[] zahlen5 = {15, 25, 22, 18, 30};
        Arrays.sort(zahlen5);
        System.out.println("Zweitgrößtes Element = " + zahlen5[zahlen5.length - 2]);
        System.out.println("--------------------------");

// 10. Erstelle ein int-Array mit den Elementen: 14, 19, 5, 21
//     Gib die kleinste (Minimum) Zahl aus.
        int[] zahlen6 = {14, 19, 5, 21};
        Arrays.sort(zahlen6);
        System.out.println("Kleinste Zahl = " + zahlen6[0]);
        System.out.println("--------------------------");

// 11. Erstelle ein int-Array mit den Elementen: 12, 2, 5, 15, 8
//     Gib das größte Element aus.
        int[] zahlen7 = {12, 2, 5, 15, 8};
        Arrays.sort(zahlen7);
        System.out.println("Größtes Element = " + zahlen7[zahlen7.length - 1]);
        System.out.println("--------------------------");

// 12. Erstelle ein String-Array mit den Elementen: "Apple", "Orange", "Banana", "Pineapple"
//     Überprüfe, ob das Element "Apple" im Array vorhanden ist.
//     Wenn ja, gib "true" aus.
//     Verwende Schleifen (Loops).
        String[] fruits2 = {"Apple", "Orange", "Banana", "Kiwi"};
        System.out.print("Ist Apple im Obst-Array vorhanden? ");
        for (int i = 0; i < fruits2.length; i++) {
            if (fruits2[i].equals("Apple"))
                System.out.println("true");
        }
        System.out.println("--------------------------");

// 13. Erstelle folgenden String: "$12 $23 $10 $2 $5 $2"
//      Entferne die '$'-Zeichen und summiere die Zahlen.
//      Gib die Summe aus.
        String[] dollar = {"$12", "$23", "$10", "$2", "$5", "$2"};
        int sum4 = 0;
        for (int i = 0; i < dollar.length; i++) {
            sum4 += Integer.parseInt(dollar[i].substring(1));
        }
        System.out.println("Summe = " + sum4);
        System.out.println("--------------------------");

// 14. Erstelle ein 2D int-Array wie folgt: [{2,3,2} , {4,1,5} , {7,2,5}]
//      Ersetze alle 2er durch 6er.
//      Gib das Array aus.
        int[][] array2D = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == 2) {
                    array2D[i][j] = 6;
                }
            }
        }
        System.out.println("Array = ");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

// 15. Erstelle ein 2D int-Array wie folgt: [{5,2,1} , {10,2,3,6} , {1,2}]
//     Summiere alle Elemente im 2D-Array.
//     Gib die Summe aus.
//     Das Ergebnis sollte 32 sein.
        int[][] array2Dx = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};
        int sum5 = 0;
        for (int i = 0; i < array2Dx.length; i++) {
            for (int j = 0; j < array2Dx[i].length; j++) {
                sum5 += array2Dx[i][j];
            }
        }
        System.out.println("Summe = " + sum5);
        System.out.println("--------------------------");

// 16. Erstelle ein 2D String-Array wie folgt:
//     [{"new jersey","atlanta","ohio"} ,
//      {"Pittsburgh" ,"ohio","new york","ohio"} ,
//      {"ohio","new york"}]
//     Ersetze alle "ohio"s durch "Florida".
//     Gib das Array aus.
        String[][] citiesArray = {
                {"new jersey", "atlanta", "ohio"},
                {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        for (int i = 0; i < citiesArray.length; i++) {
            for (int j = 0; j < citiesArray[i].length; j++) {
                if (citiesArray[i][j].equals("ohio")) {
                    citiesArray[i][j] = "Florida";
                }
            }
        }
        System.out.println("Array = ");
        for (int i = 0; i < citiesArray.length; i++) {
            for (int j = 0; j < citiesArray[i].length; j++) {
                System.out.print(citiesArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
}
