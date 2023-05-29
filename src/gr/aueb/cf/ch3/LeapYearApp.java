package gr.aueb.cf.ch3;

/**
 * Εμφανίζει αν ένα έτος που θα
 * δίνει ο χρήστης είναι δίσεκτο ή όχι.
 */

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;

        System.out.println("Please insert a Year");
        year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
