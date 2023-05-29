package gr.aueb.cf.testbed;

/**
 * Εκτυπώνει αστεράκια (οριζόντια, κάθετα, n γραμμές με n
 * αστεράκια, 1-n και n-1) με βάση την επιλογή του
 * χρήστη από το μενού και έπειτα δίνει αριθμό stars
 * που θέλει να εμφανιστούν.
 */
import java.util.Scanner;

public class StarsPrinter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int n;

        do {
            printMenu();
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παραπάνω");
            choice = in.nextInt();

            if (choice >= 1 && choice <= 5) {
                System.out.println("Παρακαλώ επιλέξτε n αστεράκια");
                n = in.nextInt();

                switch (choice) {
                    case 1:
                        printStarsHor(n);
                        break;
                    case 2:
                        printStarsVer(n);
                        break;
                    case 3:
                        printStarsNLines(n);
                        break;
                    case 4:
                        printStars1ToNLines(n);
                        break;
                    case 5:
                        printStarsNMinus1Lines(n);
                        break;
                    case 6:
                        System.out.println("Επιλέξατε Έξοδο.");
                        break;
                    default:
                        System.out.println("Λάθος επιλογή");
                }
            } else if (choice < 1 || choice > 6) {
                System.out.println("Λάθος επιλογη");
            }
        } while (choice != 6) ;
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void printStarsHor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsVer(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println("*");
            }
        }

    public static void printStarsNLines(int n) {
            for (int i = 1; i <= n; i++) {
                printStarsHor(n);
            }
        }

    public static void printStars1ToNLines(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsHor(i);
        }
    }

    public static void printStarsNMinus1Lines(int n) {
        for (int i = n - 1; i > 0; i--) {
            printStarsHor(i);
        }
    }
}