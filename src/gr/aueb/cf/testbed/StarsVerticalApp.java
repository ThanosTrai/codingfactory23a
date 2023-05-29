package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει κάθετα πλήθος απο
 * αστεράκια n που δίνει ο χρήστης.
 */

public class StarsVerticalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert a number to display stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
