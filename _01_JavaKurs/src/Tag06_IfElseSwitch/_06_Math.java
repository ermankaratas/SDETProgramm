package Tag06_IfElseSwitch;

public class _06_Math {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;

        System.out.println("Größere Zahl = " + Math.max(a,b));
        System.out.println("Kleinere Zahl = " + Math.min(a,b));
        System.out.println("a hoch 3 = " + Math.pow(a,b));
        System.out.println("Quadratwurzel von b = " + Math.sqrt(b));
        System.out.println("3,5 gerundet auf 4 = " + Math.round(3.5));
        System.out.println("3,1 aufwärts gerundet auf 4 = " + Math.ceil(3.1));
        System.out.println("3,9 abwärts gerundet auf 3 = " + Math.floor(3.9));
        System.out.println("Zufallszahl = " + Math.random()); //(als double, zwischen 0 und 1)
        int zufallszahl = (int)(Math.random() * 10); // Generiere eine Zufallszahl zwischen 1 und 10
    }
}
