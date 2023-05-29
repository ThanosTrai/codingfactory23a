package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/fos.txt", true), true, StandardCharsets.UTF_8)) {          //η 2η παραμετρος του PrintStream οταν θέλουμε να κανουμε autoflush (δημιουργια νέου txt αρχείου), η 2η παραμετρος του FileOutputStream κάνει append(γράφει μέσα  στο ιδιο αρχειο)
            ps.println("Καλησπέρα!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
