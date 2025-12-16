package Core.Java.com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCounts {
    //  pseudocode for each character count from a given string
            /*
                Converting String to stream of character
                FOR each character ch
                    put ch into map
                    if ch exists -> increment count
                    else -> set count as 1
                    END
                 */

    public static void characterCountsWithMergeFunction(String str) {
        Map<Character,Long> countMap=new HashMap<>();
                str.chars()
                        .mapToObj(c ->(char)c)
                        .filter(c ->c !=' ')
                        .forEach(c -> countMap.merge(c,1L, Long::sum));
        System.out.println(countMap);
        }
        
        public static void charCountUsingGroupingBy(String str){
                Map<Character,Long> charCount=
                 str.chars().mapToObj(c ->(char)c)
                .filter(c -> c !=' ')
                .collect(Collectors.groupingBy(c ->c ,Collectors.counting()));

            charCount.forEach((k, v) ->
                    System.out.println(k + " -> " + v)
            );
                
            }
        }



