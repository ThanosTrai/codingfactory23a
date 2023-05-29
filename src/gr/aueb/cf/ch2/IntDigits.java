package gr.aueb.cf.ch2;

public class IntDigits {

    public static void main(String[] args) {
        int num = 229;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        leftDigit = num / 10;
        rightDigit = num % 10;

        sum = leftDigit + rightDigit;

        System.out.printf("LeftDigit: %d, RightDigit: %d, Sum: %d", leftDigit, rightDigit, sum);
    }
}
