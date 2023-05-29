package gr.aueb.cf.ch3;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάση τρεις μεταβλητές:
 * αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον
 * από τα επόμενα: είναι σκοτάδι Ή τρέχουμε
 * (speed > 100). Τις τιμές αυτές τις λαμβάνουμε
 * από τον χρήστη (stdin).
 */
import java.util.Scanner;

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);
    }
}
