package gr.aueb.cf.ch6;

/**
 * Λαμβάνει ως input ένα πίνακα βαθμολογιών (ακεράιων
 * από 0 - 100) και εμφανίζει την κατανομή των βαθμών
 * σε ένα chart.
 */
public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {30, 9, 12, 22, 28, 29, 21, 34, 44, 46, 47, 48, 49, 55, 67, 69, 89, 90, 95, 100};
        int[] distribution = new int[10];

        for (int grade : grades) {
            if (grade == 100) distribution[9] += 1;
            else distribution[grade / 10] += 1;
        }

            for (int i = 0; i < distribution.length; i++) {
                System.out.printf("%02d-%02d: ", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
                for (int j = 1; j <= distribution[i]; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
