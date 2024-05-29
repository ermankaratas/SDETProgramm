package Tag08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_Frage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userArray = new int[10];
        for (int i = 0; i < userArray.length; i++)
            userArray[i] = (int) (Math.random() * 11);
        System.out.println("userArray = " + Arrays.toString(userArray));
        //System.out.print("Geben Sie Ihre Zahl ein(0-10) = ");
        int userNumber = scanner.nextInt();
        int ungerade = 0;
        int gerade = 0;
        for (int i = 0; i < userArray.length; i++) {
            if (userNumber == userArray[i]) {
                System.out.println("Index der Zahl = " + i);
            }
            if (userArray[i] % 2 == 1)
                ungerade++;
            else
                gerade++;
        }
        System.out.println("Ungerade Zahlen = " + ungerade);
        System.out.println("Gerade Zahlen = " + gerade);
    }
}
