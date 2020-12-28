package stringChange;

public class MonoStand {
    public static String encrypt(String text, int n) {
        if (n <= 0) {
            return text;
        }
        if (text.isEmpty() || text.isBlank()) {
            return text;
        }
        int counter = 0;
        System.out.print(" (" + text + ", " + n + ")");
        do {
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                if (i % 2 != 0) {
                    even.append(text.charAt(i));
                } else {
                    odd.append(text.charAt(i));
                }
            }
            text = even.append(odd).toString();
            System.out.print(" ->" + "'" + text + "'");
            counter++;
        } while (counter < n);
        return text;
    }

    public static String decrypt(String encrypted_text, int n) {
        int counter = 0;
        System.out.print(" (" + encrypted_text + ", " + n + ")");
        do {
            StringBuilder decrypted_text = new StringBuilder();
            for (int i = 0, middle = encrypted_text.length() / 2;
                 i < encrypted_text.length() / 2; i++, middle++) {
                decrypted_text.append(encrypted_text.charAt(middle));
                decrypted_text.append(encrypted_text.charAt(i));
            }
            encrypted_text = decrypted_text.toString();
            System.out.print(" ->" + "'" + encrypted_text + "'");
            counter++;
        } while (counter < n);
        return encrypted_text;
    }
}
