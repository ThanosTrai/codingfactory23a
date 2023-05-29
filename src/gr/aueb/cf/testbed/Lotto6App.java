package gr.aueb.cf.testbed;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto6App {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:/tmp/lotto6in.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lotto6out.txt", StandardCharsets.UTF_8)) {

             final int LOTTO_SIZE = 6;
             int[] inputNumbers = new int[49];
             int pivot = 0;
             int[] result = new int[6];
             int window;
             int num;

             while ((num = in.nextInt()) != -1 && pivot <= 48) {
                 inputNumbers[pivot++] = num;
             }

             int[] numbers = Arrays.copyOfRange(inputNumbers, 0, pivot);
             Arrays.sort(numbers);

             window = pivot - LOTTO_SIZE;
            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    result[0] = numbers[i];
                                    result[1] = numbers[j];
                                    result[2] = numbers[k];
                                    result[3] = numbers[l];
                                    result[4] = numbers[m];
                                    result[5] = numbers[n];

                                    if (!isEven(result, 4) && !isOdd(result, 4) && !isContiguous(result, 2)
                                            && !isSameEnding(result, 3) && !isSameTen(result, 3)) {
                                        ps.printf("%d %d %d %d %d %d%n",
                                                result[0], result[1], result[2], result[3], result[4], result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static boolean isEven(int[] arr, int threshold) {
            int even = 0;

            for (int num : arr) {
                if (num % 2 == 0) even++;
            }

            return even > threshold;

        }

        public static boolean isOdd(int[] arr, int threshold) {
            int odd = 0;

            for (int num : arr) {
                if (num % 2 != 0) odd++;
            }

            return odd > threshold;
        }

    public static boolean isContiguous(int[] arr, int threshold) {
        Arrays.sort(arr);

        int contiguous = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                contiguous++;
                if (contiguous > threshold) {
                    return true;
                }
            } else {
                contiguous = 1;
            }
        }

        return false;
    }

        public static boolean isSameEnding(int[] arr, int threshold) {
            int sameEnding = 0;
            int lastDigit1 = 0;
            int lastDigit2 = 0;

            for (int i = arr.length - 1; i > 0; i--) {
                lastDigit1 = arr[i] % 10;
                lastDigit2 = arr[i - 1] % 10;

                if (lastDigit1 == lastDigit2) {
                    sameEnding++;
                }
            }

            return sameEnding > threshold;
        }

    public static boolean isSameTen(int[] arr, int threshold) {
        int maxCount = 0;
        int currentCount = 1;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 1;
            }
        }

        return maxCount > threshold;
    }
}
