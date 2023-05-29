package gr.aueb.cf.ch6;

public class FindMissingNumberApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missing = getMissingNumber(arr);

        System.out.print("Missing number is: " + missing);


    }

    public static int getMissingNumber(int[] arr) {
        int expectedSum;
        int sum = 0;

        expectedSum = (arr.length + 1) * (arr.length + 2) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return expectedSum - sum;

    }
}
