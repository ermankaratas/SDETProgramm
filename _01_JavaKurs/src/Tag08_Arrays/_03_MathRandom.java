package Tag08_Arrays;

public class _03_MathRandom {
    public static void main(String[] args) {
        // Fülle ein Array mit den Namen von 5 Fernsehsendern
        // Wähle dann zufällig einen aus und gib ihn auf dem Bildschirm aus

        String[] tvSender = {"ARD", "ZDF", "Live1", "WDR", "NDR"};
        int zufallsIndex = (int) (Math.random() * tvSender.length);
        System.out.println("Ausgewählter TV-Sender: " + tvSender[zufallsIndex]);
    }
}
