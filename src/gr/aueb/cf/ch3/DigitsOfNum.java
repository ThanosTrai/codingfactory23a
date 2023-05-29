package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει και εμφανίζει το άθροισμα των ψηφίων
 * ενός ακεραίου που δίνει ο χρήστης.
 */

public class DigitsOfNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int remaining = 0;
        int rightmostDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a num");
        num = in.nextInt();
        remaining = num;

        do {
            rightmostDigit = remaining % 10;
            sumOfDigits = sumOfDigits + rightmostDigit;
            remaining = remaining / 10;
        } while (remaining != 0);

        System.out.println("Sum of Digit: " + sumOfDigits);
    }
}
