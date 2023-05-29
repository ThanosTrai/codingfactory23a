package gr.aueb.cf.ch6;

/**
 * Αναζητά το ελάχιστο και μέγιστο
 * στοιχείο ενός πίνακα καθώς και την θέση
 * στην οποία βρίσκονται
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 72, 7, 15, 42, 20, 15, 83, 64, 74};

        int minPosition = 0;
        int minValue = arr[0];
        int maxPos = 0;
        int maxValue = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < minValue) {
                minValue = arr[j];
                minPosition = j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPos = i;
            }
        }



        System.out.printf("Min value: %d, Min Position: %d\n", minValue, minPosition + 1);
        System.out.printf("Max value: %d, Max Position: %d\n", maxValue, maxPos + 1);

    }
}
