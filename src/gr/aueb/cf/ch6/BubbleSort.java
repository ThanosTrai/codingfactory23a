package gr.aueb.cf.ch6;

/**
 * Sorts the elements of an array
 * using the BubbleSort Algorithm.
 */
public class BubbleSort {

    public static int[] arr = {6, 14, 12, 23, 3, 32, 84, 5, 52, 44, 80, 7, 92, 16};

    public static void main(String[] args) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) swap(j, j + 1);
            }
}
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }


    public static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}