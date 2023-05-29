package gr.aueb.cf.testbed;

/**
 * Finds the second min value of an array
 */
public class SecondMinValueArrayApp {

    public static void main(String[] args) {
        int[] arr = {49, 7, 17, 19, 36, 14, 23, 52};

        int minValue = arr[0];
        int minPosition = 0;
        int secondMinValue = arr[0];
        int secondMinPos = 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < minValue && arr[i] < secondMinValue) {
                secondMinPos = minPosition;
                secondMinValue = minValue;
                minPosition = i;
                minValue = arr[i];

            } else if (arr[i] > minValue && arr[i] < secondMinValue) {
                    secondMinPos = i;
                    secondMinValue = arr[i];
                }
        }

        System.out.printf("Min Value is: %d\nMin Position is: %d\n", minValue, minPosition +1);
        System.out.printf("Second Min Value is: %d\nSecond Min Position is: %d\n", secondMinValue, secondMinPos + 1);
    }

}
