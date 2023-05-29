package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ακέραιο που αντιστοιχεί στο
 * πλήθος δευτερολέπτων και μετατρέπει σε ημέρες, ώρες, λεπτά
 * και δευτερόλεπτα και εκτυπώνει το αποτέλεσμα στην οθόνη
 */

public class SecondsDemo {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int DAY = 24 * 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds, days, hours, minutes, remainingSeconds;

        //Εντολές
       System.out.println("Please insert the count of Seconds");
       inputSeconds = in.nextInt();
       remainingSeconds = inputSeconds;

       days = remainingSeconds / DAY;
       remainingSeconds = remainingSeconds % DAY;

       hours = remainingSeconds / HOUR;
       remainingSeconds = remainingSeconds % HOUR;

       minutes = remainingSeconds / MINUTE;
       remainingSeconds = remainingSeconds % MINUTE;


        System.out.printf("Input Seconds: %d = %d Days, %d Hours, %d Minutes, %d Seconds",
                inputSeconds, days, hours, minutes, remainingSeconds);


    }
}
