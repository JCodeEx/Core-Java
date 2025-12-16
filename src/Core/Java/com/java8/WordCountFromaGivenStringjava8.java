package Core.Java.com.java8;

import java.util.Arrays;

public class WordCountFromaGivenStringjava8 {

    public static void java8Used(String input){
        // Using Java 8 Stream API
       // String input = "  Hello   world! This is a   test string for testing .  ";
        long wordCount = Arrays.stream(input.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Number of words using Java 8: " + wordCount);
    }
}
