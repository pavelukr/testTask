package stringChange;

import static stringChange.MonoStand.decrypt;
import static stringChange.MonoStand.encrypt;

public class DemoClass {
    public static void main(String[] args) {
        String encrypted_text = encrypt("abcdefgi", 5);
        System.out.println();
        decrypt(encrypted_text, 5);
    }
}
