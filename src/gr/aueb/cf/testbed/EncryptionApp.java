package gr.aueb.cf.testbed;

/**
 * Finds and replaces each char of a String
 * with the next one based on ASCII table.
 */
public class EncryptionApp {

    public static void main(String[] args) {
        String s = "Hello Coding Factory";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append((char) (ch + 1));
        }

        String encrypted = sb.toString();
        System.out.println("Encrypted word: " + encrypted);
    }
}
