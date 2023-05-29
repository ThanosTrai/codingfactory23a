package gr.aueb.cf.ch2;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class EurosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputEuros;
        int euros500, euros100, euros50, euros20, euros10, euros5, euros1;
        int remainingEuros;

        System.out.println("Please insert the amount (in Euros)");
        inputEuros = in.nextInt();

        remainingEuros = inputEuros;

        euros500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euros100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euros20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euros50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euros10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        euros5 = remainingEuros / 5;
        remainingEuros = remainingEuros % 5;

        System.out.printf("%d Euros = euros500: %d, euros100: %d, euros50: %d\n",
                inputEuros, euros500, euros100, euros50);
        System.out.printf("euros20: %d, euros10: %d, euros5: %d, euros: %d",
                euros20, euros10, euros5, remainingEuros);
    }
}
