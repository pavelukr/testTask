package stringMax;

import static stringMax.App.mostFrequent;
import static stringMax.App.readString;

public class DemoClass {
    public static void main(String[] args) {
        String string = "Peter Piper picked a peck of pickled peppers\n" +
                "A peck of pickled peppers Peter Piper picked\n" +
                "If Peter Piper picked a peck of pickled peppers\n" +
                "Where’s the peck of pickled peppers Peter Piper picked?";
        String[] array = mostFrequent(readString(string));
        for (String str : array) {
            System.out.println(str);
        }
    }
}
