package Tag08_Arrays;

public class _08_Frage {
    public static void main(String[] args) {
        int[][] table = new int[2][3];

        // Die Tabelle mit zufälligen Zahlen füllen
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 100);
            }
        }

        // Die Tabelle ausgeben
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
