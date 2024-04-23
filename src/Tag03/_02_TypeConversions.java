package Tag03;

public class _02_TypeConversions {
    public static void main(String[] args) {
        byte note1 = 98;
        byte note2 = 97;
        byte note3 = 99;
        byte note4 = 100;

        // Es gibt kein Problem, wenn wir den kleinen Eimer in den großen Eimer legen
        int summe = note1 + note2 + note3 + note4;

        // Die Variable "summe" war vom Typ int, wir haben sie in byte umgewandelt
        byte summe2 = (byte) summe;

        // Da beim Entleeren des großen Eimers in den kleinen Eimer ein möglicher Datenverlust besteht,
        // müssen wir das explizit angeben, um zu zeigen, dass wir dies absichtlich tun
        // Andernfalls gibt es eine Warnung und der Code funktioniert nicht
    }
}
