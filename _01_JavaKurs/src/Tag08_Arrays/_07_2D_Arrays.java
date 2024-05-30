package Tag08_Arrays;

import java.util.Arrays;

public class _07_2D_Arrays {
    public static void main(String[] args) {
        int[][] array2D = new int[3][5];

        int[][] array_2D = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        // Zweidimensionales Array ausgeben
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.println(array_2D[i][j]);
        }

        // Länge der ersten Zeile und Anzahl der Zeilen im Array
        System.out.println(Arrays.toString(array_2D[0]));
        System.out.println((array_2D[0]).length);
        System.out.println(array_2D.length);

        // Zweidimensionales Array mithilfe von Schleifen durchlaufen
        for (int i = 0; i < array_2D.length; i++) {
            for (int j = 0; j < array_2D[i].length; j++)
                System.out.println(array_2D[i][j]);
        }
    }
}
