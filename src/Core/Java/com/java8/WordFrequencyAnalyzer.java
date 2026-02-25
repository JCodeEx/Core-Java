package Core.Java.com.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyAnalyzer {
    /*
    need to find out how many times each element of list two is present in listOne
     //List<String> listOne= List.of("ab", "ab", "abc");
     //List<String>listTwo=List.of("ab", "abc", "bc");
     */
    public static void wordCountOccurence() {
        List<String> listOne = List.of("apple", "banana", "apple", "cherry", "apple");
        List<String> listTwo = List.of("apple", "banana", "cherry", "date");

        Map<String, Long> countMap = listOne.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);

        List<Long> result = listTwo.stream()
                .map(s -> countMap.getOrDefault(s, 0L)).toList();
        System.out.println(result);

    }

    public static void wordCountOccurence2() {
        List<String> listOne = List.of("apple", "banana", "apple", "cherry", "apple");
        List<String> listTwo = List.of("apple", "banana", "cherry", "date");

        // Count occurrences in listOne
        Map<String, Long> countMap = new HashMap<>();
        for (String word : listOne) {
            countMap.merge(word, 1L, Long::sum);
        }
        System.out.println(countMap);
        // Build result list for listTwo
        List<Long> result = new ArrayList<>();
        for (String word : listTwo) {
            result.add(countMap.getOrDefault(word, 0L));
        }

        System.out.println(result);
    }
         }


