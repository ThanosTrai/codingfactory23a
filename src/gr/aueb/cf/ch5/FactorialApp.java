package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * (n!) με τη μέθοδο facto()
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert an int");
        n = in.nextInt();

        System.out.printf("%d! = %d", n, facto(n));
    }

    /**
     * Returns n!
     * @param n     the number (n) of n!.
     * @return      1 * 2 * 3 *... * n.
     */
    public static int facto(int n) {
        int facto = 1;

        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }
}
