package gr.aueb.cf.testbed;

/**
 * Finds and gets the max value of an
 * element inside an array
 * with the use of a method.
 */
public class ArrayMaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {6, 12, 22, 36, 47, 31, 55, 67, 22, 45, 86, 64, 72};
        int maxPosition;

        maxPosition = getMaxPosition(arr, 0, arr.length - 1);

        System.out.printf("Max value is: %d\nMax position is: %d", arr[maxPosition], maxPosition + 1);
    }

    /**
     *
     * @param arr       an array of integers
     * @param low       the start position inside array
     * @param high      the end position inside array
     * @return          the position of the element that has max value in the array
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null || low < 0 || high > arr.length) return -1;

        int maxPosition = 0;
        int maxValue = arr[high];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
               maxValue = arr[i];
               maxPosition = i;
            }
        }
        return maxPosition;
    }
}
