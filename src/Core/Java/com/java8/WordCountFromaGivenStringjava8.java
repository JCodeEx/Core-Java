package Core.Java.com.java8;

import java.util.*;
import java.util.stream.Collectors;

public class WordCountFromaGivenStringjava8 {
    /*
    BEGIN
READ inputString
trimmedString ← trim(inputString)
wordArray ← split trimmedString using regex "\\s+"
wordStream ← convert wordArray to stream
validWords ← filter wordStream where word is not empty
wordCount ← count elements in validWords
PRINT wordCount
END

     */


    public static void wordCountUsingStream(String input) {
        // Using Java 8 Stream API
        // String input = "  Hello   world! This is a   test string for testing .  ";
        long wordCount = Arrays.stream(input.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
        System.out.println("Number of words using Java 8: " + wordCount);
    }

    public static void wordCountUsingMerge() {
        List<String> inputData = Arrays.asList("hi", "hi", "Hi", "hello");
        Map<String, Integer> mapCount = new HashMap<>();
        for (String word : inputData) {
            mapCount.merge(word, 1, Integer::sum);
        }
        System.out.println(mapCount);
    }
}
