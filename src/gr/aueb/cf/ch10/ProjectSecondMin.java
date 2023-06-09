package gr.aueb.cf.ch10;

/**
 * Finds the second min of an array of integers.
 */
public class ProjectSecondMin {

    public static void main(String[] args) {
        int[] arr = {12, 32, 4, 8, 9, 14, 29, 58, 12, 6};
        int secondMinPosition;
        int secondMinValue;

        secondMinPosition = getSecondMinPosition(arr);
        secondMinValue = arr[secondMinPosition];

        System.out.printf("Second smallest element position is: %d\nSecond Min Value is: %d", secondMinPosition + 1, secondMinValue);
    }

    public static int getSecondMinPosition (int[] arr) {
        int minPos = 0;
        int secondMinPos = 0;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return - 1;

        minValue = arr[0];
        secondMinValue = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue && arr[i] < secondMinValue) {
                secondMinPos = minPos;
                secondMinValue = minValue;
                minPos = i;
                minValue = arr[i];

            } else if (arr[i] > minValue && arr[i] < secondMinValue ) {
                secondMinPos = i;
                secondMinValue = arr[i];
            }
        }

        return secondMinPos;
    }
}
