package gr.aueb.cf.ch6;

public class StringVsCharArrayApp {

    public static void main(String[] args) {
        int[] ages = {20, 25, 30, 33, 45, 19, 90, 55};

        printArray(ages, 1, ages.length - 2);

    }

    public static void printArray(int[] arr, int low, int high) {
        if ((low < 0) || (high > arr.length - 1)) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
