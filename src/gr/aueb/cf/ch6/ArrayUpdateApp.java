package gr.aueb.cf.ch6;

/**
 * Replaces all occurrences of KEY in an array of ints.
 */
public class ArrayUpdateApp {

    public static void main(String[] args) {
        final int KEY = 10;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == KEY) {
                arr[i] = KEY + 7;
            }
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
