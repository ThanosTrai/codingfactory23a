package gr.aueb.cf.ch6;

public class SumArrayApp {

    public static void main(String[] args) {
        int[] array = {87, 46, 56, 38, 79, 23, 89, 49, 45, 68, 23};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
        total += array[counter];
    }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
