package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n αστεράκια και αφήνει γραμμές
 * εως ότου n γραμμές.
 */

public class StarsNxN {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = 0;

        System.out.println("Please give a number to display stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
