package Core.Java.com.java6;

import java.util.Arrays;

public class NumberOfWordsInAString {

    public int numberOfWordsInAString(String input) {
       /* if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s");
        return words.length;*/

        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
            return 0;
        }else {
            String[] words = input.split("\\s+");
            System.out.println("Number of words: " + words.length);
            return words.length;
        }

    }
    public void java8Used(){
        // Using Java 8 Stream API
        String input = "  Hello   world! This is a   test string.  ";
        long wordCount = Arrays.stream(input.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Number of words using Java 8: " + wordCount);
    }
}
