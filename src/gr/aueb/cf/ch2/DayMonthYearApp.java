package gr.aueb.cf.ch2;

/**
 * Ο χρήστης δίνει 3 ακέραιους
 * ημέρα, μήνα και χρόνο και στην συνέχεια
 * το εμφανίζει με την μορφή DD/MM/YY
 *
 */

import java.util.Scanner;

public class DayMonthYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please insert day, month and year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt() % 100;


        System.out.printf("%02d/%02d/%02d", day, month, year);

    }
}
