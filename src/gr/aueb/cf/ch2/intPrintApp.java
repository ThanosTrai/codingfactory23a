package gr.aueb.cf.ch2;

import java.util.function.DoubleFunction;

public class intPrintApp {

    public static void main(String[] args) {
        int i = 5;

//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d", i);
//
//        System.out.print("Result = " + i);
//        System.out.println("Result = " + i);
//        System.out.printf("Result = %d%n", i);

        System.out.printf("%,04d", i);  //left padding - προσθετει μηδενικα οταν βάζουμε 04 μπροστα απο το d  //το κομμα μετά το % ειναι διαχωριστικο χιλιαδων


    }
}
