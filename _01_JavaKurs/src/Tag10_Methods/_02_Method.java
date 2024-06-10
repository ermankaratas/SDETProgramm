package Tag10_Methods;

import java.util.Scanner;

public class _02_Method {
    public static void main(String[] args) {

        // Aufrufpfad: package.class.method()
        // Wenn es sich im selben Paket befindet: class.method
        Tag10_Methods._01_Method.arrayFuellen();
        _01_Method.arrayFuellen();

        halloSchreibenName("Iris");
        halloSchreibenViele(5);

        groessteSchreiben();
        groessteSchreiben(56,70);
    }

    public static int summeFinden(int ... array){           // Nimmt beliebig viele Argumente entgegen und speichert sie im Array
        return 0;
    }

    public static void halloSchreibenName(String name){        // void bedeutet, dass keine Daten zurückgegeben werden
        System.out.println("Hallo " + name);
    }

    public static void halloSchreibenViele(int menge){
        for (int i = 0; i < menge; i++) {
            System.out.println("Hallo");
        }
        halloSchreibenName("Joseph");                       // Kann von überall aufgerufen werden
    }

    public static void groessteSchreiben(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Bitte geben Sie eine weitere Zahl ein: ");
        int zahl2 = scanner.nextInt();

        groessteSchreiben(zahl1, zahl2);                            // Die if-Anweisungen können so abgekürzt werden
    }

    public static void groessteSchreiben(int zahl1, int zahl2){
        if (zahl1 > zahl2)
            System.out.println(zahl1 + " ist größer.");
        else if (zahl1 < zahl2)
            System.out.println(zahl2 + " ist größer.");
        else
            System.out.println("Die Zahlen sind gleich groß.");
    }
}
