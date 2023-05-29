package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στην θέση X και θέλει να φτάσει στη
 * θέση Y (ή σε θέση >= Y). O frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * starts at 10, και μετά το 1o jump πάει στην θέση 10 + 30 = 40.
 * Στο 2ο jump πάει 40 + 30 = 70
 * Στο 3ο jump πάει 70 + 30 = 100
 */

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y = 0;
        int d;
        int jumps = 0;

        System.out.println("Please provide X, Y and D values");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextByte();

        for (int i = x; i <= y; i = i + d) {
            jumps++;
        }

        System.out.printf("Start: %d, Finish: %d, Step: %d, Jumped: %d", x, y, d, jumps);
    }
}
