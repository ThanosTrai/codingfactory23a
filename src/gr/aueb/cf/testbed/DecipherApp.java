package gr.aueb.cf.testbed;

/**
 * Replaces each char of a String with
 * the previous char code based on ASCII table.
 */
public class DecipherApp {

    public static void main(String[] args) {
        String s = "Ifmmp!Dpejoh!Gbdupsz";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append((char) (ch - 1));
        }

        String decipher = sb.toString();
        System.out.println("Deciphered word: " + decipher);
    }
}
