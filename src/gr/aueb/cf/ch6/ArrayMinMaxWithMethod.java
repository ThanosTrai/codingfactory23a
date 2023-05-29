package gr.aueb.cf.ch6;

public class ArrayMinMaxWithMethod {

    public static void main(String[] args) {
        int[] array = {4, 7, 16, 24, 85, 42, 63, 9, 18, 34, 53, 92, 86,};

        int[] result = findMinMaxPosition(array);

        int minValue = result[0];
        int minPosition = result[1];
        int maxValue = result[2];
        int maxPosition = result[3];

        System.out.printf("Min Value is: %d, Min Position is: %d\n", minValue, minPosition + 1);
        System.out.printf("Max Value is: %d, Max Position is: %d", maxValue, maxPosition + 1);

    }

    public static int[] findMinMaxPosition(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int minValue = array[0];
        int minPosition = 0;
        int maxValue = array[0];
        int maxPosition = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minPosition = i;
            } else if (array[i] > maxValue) {
                maxValue = array[i];
                maxPosition = i;
            }
        }

        return new int[]{minValue, minPosition, maxValue, maxPosition};
    }
}
