package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το τετράγωνο και τον κύβο ενός αριθμού
 * που δίνει ο χρήστης. Χρησιμοποιεί την έτοιμη μέθοδο
 * Math.pow() της κλάσης Math.
 */

public class MathPowers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ δώστε ένα αριθμό");
        num = sc.nextInt();

        System.out.printf("Square: %d, Cube: %d",
                (int) Math.pow(num, 2), (int) Math.pow(num, 3)); // θελει typecast σε int διοτι η math.pow απο μονη της επιστρεφει double η float
    }
}
