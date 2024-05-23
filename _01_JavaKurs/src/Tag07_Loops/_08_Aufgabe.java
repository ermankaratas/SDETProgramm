package Tag07_Loops;

import java.util.Scanner;

public class _08_Aufgabe {
    public static void main(String[] args) {
        // 1- Alle geraden Zahlen zwischen 0 und 100 ausgeben (einschließlich 0 und 100).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alle geraden Zahlen = ");
        for (int i = 0; i <= 100; i += 2) {
            if (i == 100)
                System.out.print(i);
            else
                System.out.print(i + ",");
        }
        System.out.println();
        // 2- Alle ungeraden Zahlen zwischen 0 und 100 ausgeben.
        System.out.print("Alle ungeraden Zahlen = ");
        for (int i = 1; i <= 100; i += 2) {
            if (i == 99)
                System.out.print(i);
            else
                System.out.print(i + ",");
        }
        System.out.println();

        // 3- Alle ungeraden Zahlen von 100 bis 0 ausgeben.
// ``` 99-98-97-96....```
// `100 und 0 sind nicht inbegriffen.`
        System.out.print("Alle Zahlen (100-0) = ");
        for (int i = 99; i >= 1; i--) {
            if (i == 1)
                System.out.print(i);
            else
                System.out.print(i + ",");
        }
        System.out.println();

// 4- Ein Code, um die Summe der ersten 10 natürlichen Zahlen zu berechnen.
//`Erste 10 natürliche Zahlen: 1,2,3,4,5,6,7,8,9,10`
        int summe = 0;
        for (int i = 1; i <= 10; i++) {
            summe += i;
        }
        System.out.println("Summe der Zahlen (0-10) = " + summe);

// 5- Ein Code, der alle Zahlen zwischen 0 und 100 umfasst.
//    Dieser Code sollte feststellen können, ob die Zahl gerade oder ungerade ist.
//    Wenn die Zahl gerade ist;
//    **Diese Zahl ist gerade und die Zahl lautet 0**
//    Wenn die Zahl ungerade ist;
//    **Diese Zahl ist ungerade und die Zahl lautet 1**
//    soll ausgegeben werden.
//    `Das Ergebnis sollte folgendermaßen aussehen.`
//     ```
//        Diese Zahl ist gerade und die Zahl lautet 0
//        Diese Zahl ist ungerade und die Zahl lautet 1
//        Diese Zahl ist gerade und die Zahl lautet 2
//        Diese Zahl ist ungerade und die Zahl lautet 3
        String istGerade;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                istGerade = "gerade";
            else
                istGerade = "ungerade";
            System.out.printf("Diese Zahl ist %s und die Zahl lautet %d%n", istGerade, i);
        }
        System.out.println();

// 6- Alle Zahlen zwischen 0 und 100, die sowohl durch 5 als auch durch 4 teilbar sind, ausgeben.
//    Das Ergebnis sollte folgendermaßen aussehen:
//     ```
//        0
//        20
//        40
//        60
//        80
//        100
//      ```
        System.out.println("Alle Zahlen, die durch 4 und 5 teilbar sind = ");
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0)
                System.out.println(i);
        }
        System.out.println();

// 7- Ein Code, der das folgende Muster erzeugen kann, basierend auf der vom Benutzer angegebenen Länge und Breite.
//        _Beispiel:
//        _Länge(Länge): 7_
//        _Breite(Breite): 5_
//        _Ergebnis:_
//          #####
//          #####
//          #####
//          #####
//          #####
//          #####
//          #####
        System.out.print("Geben Sie die Länge ein = ");
        int länge = scanner.nextInt();
        System.out.print("Geben Sie die Breite ein = ");
        int breite = scanner.nextInt();
        for (int i = 0; i < länge; i++) {
            for (int j = 0; j < breite ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();

// 8- Ein Code, der eine Pyramide mit Sternen (*) erstellen kann.
//    Das Ergebnis sollte folgendermaßen aussehen:
//            *
//          * *
//        * * *
//      * * * *
//    * * * * *
        System.out.println("Pyramide Methode 1= ");
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0 ; j--) {
                if(j > i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pyramide Methode 2= ");
        System.out.println("---------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();

        // 9- # Ein Code, der eine Pyramide mit Sternen (*) erstellen kann.
//    Das Ergebnis sollte wie folgt aussehen:
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
        System.out.println("Pyramide Methode 1= ");
        System.out.println("---------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j >= 0 ; j--) {
                if(j > i)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Pyramide Methode 2= ");
        System.out.println("---------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println();

// 10 - # Verwenden Sie eine do-while-Schleife.
//  > Geben Sie alle geraden Zahlen zwischen 0 und 30 aus.
        System.out.println("Alle geraden Zahlen (0-30) = ");
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while (i <=30);
    }

}
