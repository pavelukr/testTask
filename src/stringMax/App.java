package stringMax;

import java.util.Arrays;

public class App {
    public static String[] readString(String string) {
        String[] words = string.split("[\\s,.?!&$;:%]+");
        if (words.length < 3) {
            String[] arr = new String[0];
            return arr;
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        return words;
    }

    public static String[] mostFrequent(String[] array) {
        Arrays.sort(array);
        int[] frequency = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    frequency[i]++;
                }
            }
        }
        boolean isSorted = false;
        int buf;
        String temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (frequency[i] > frequency[i + 1]) {
                    isSorted = false;

                    buf = frequency[i];
                    frequency[i] = frequency[i + 1];
                    frequency[i + 1] = buf;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i = array.length-1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                if (array[i] != null) {
                    if (array[i].equals(array[j])) {
                        array[j] = null;
                    }
                }
            }
        }
        String[] arrayMax = new String[3];
        int counter = 0;
        int end = 1;
        do {
            if (array[array.length - end]!= null) {
                arrayMax[counter] = array[array.length - end];
                end++;
                counter++;
            } else {
                end++;
            }
        } while (counter < 3);
        return arrayMax;
    }
}

