package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει αστεράκια από 1 έως
 * n που δίνει ο χρήστης κατά αύξουσα σειρά
 */

public class StarsAscendApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give a number to display stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
