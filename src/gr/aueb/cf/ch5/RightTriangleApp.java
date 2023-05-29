package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από τον χρήστη, τις
 * a, b, c όπου a είναι η υποτείνουσα και
 * b, c οι δύο πλευρές.
 *
 * Ελέχγει αν το τρίγωνο είναι ορθογώνιο, δηλ. \
 * a^2 == b^2 + c^2
 *
 * Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please give an a, b and c doubles");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            isRight = true;
        }

        System.out.println(isRight);
    }
}
