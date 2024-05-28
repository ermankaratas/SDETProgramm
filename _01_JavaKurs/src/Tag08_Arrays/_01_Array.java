package Tag08_Arrays;

import java.util.Scanner;

public class _01_Array {
    public static void main(String[] args) {
        // Definition eines Arrays zur Speicherung von 50 Noten
        int[] notes = new int[50]; // Array kann 50 Werte speichern

        // Initialisierung einiger Noten
        notes[0] = 50;
        notes[1] = 50;
        //..
        //..
        notes[49] = 89; // Das letzte Element des Arrays

        // Ausgabe der ersten und letzten Note im Array
        System.out.println("notlar[0], 1.Öğrenci notu = " + notes[0]);
        System.out.println("notlar[49], 50.Öğrenci notu = " + notes[49]);

        // Ausgabe der Anzahl der Elemente im Array
        System.out.println("kaç tane not var = " + notes.length);

        // Einlesen von 10 Zahlen und Speichern in einem Array
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". element of array = ");
            array[i] = scanner.nextInt(); // Benutzereingabe wird in das Array gespeichert
        }

        // Ausgabe der Elemente des Arrays
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
