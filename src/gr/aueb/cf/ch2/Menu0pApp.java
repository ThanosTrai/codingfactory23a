package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Menu0pApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please provide two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        System.out.printf("Sum: %d\n", num1 + num2);
        System.out.printf("Sub: %d\n", num1 - num2);
        System.out.printf("Mul: %d\n", num1 * num2);
        System.out.printf("Div: %d\n", num1 / num2);
        System.out.printf("Mod: %d\n", num1 % num2);
    }
}
