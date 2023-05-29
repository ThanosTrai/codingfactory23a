package gr.aueb.cf.ch6;

/**
 * Finds the min value of an unsorted array
 */
public class ArrayMinApp {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};

        int minValue = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d", minValue);
    }
}
