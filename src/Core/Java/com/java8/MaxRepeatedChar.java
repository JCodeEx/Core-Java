package Core.Java.com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepeatedChar {
    public static void maxChar(String input){
        System.out.println("input data --"+input);
        //input="rasmin giri";
        Map<Character, Long> frequency =
                input.trim().chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));
        Map.Entry<Character, Long> maxEntry =
                frequency.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(frequency);
        System.out.println("Max repeated char: " + maxEntry.getKey());
        System.out.println("Count: " + maxEntry.getValue());
    }
}
