package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το γινόμενο των n πρώτων
 * ακεραίων
 */

public class MulGeneric {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int result = 1;
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            result = result * i;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
