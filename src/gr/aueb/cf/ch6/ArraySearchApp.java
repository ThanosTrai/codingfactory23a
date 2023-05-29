package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET_KEY = 10;
        int[] arr = {2, 5, 8, 9, 15, 10};
        boolean keyIsFound = false;

        for (int item : arr) {
            if (item == SECRET_KEY) {
                keyIsFound = true;
                break;
            }
        }

        if (keyIsFound) {
            System.out.println("Key was found");
        } else {
            System.out.println("Key was not found");
        }
    }
}
