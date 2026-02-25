package Core.Java.com.java6;

import java.util.*;

public class Anagrams {
    public static  boolean anagramCheck(String str1,String str2){
       // String str1="listen";
        //String str2="silent";
        if (str1.length()!=str2.length()){
            System.out.println("the words are not anagram");
            return false;
        }else {
            char[]arr1=str1.toCharArray();
            char[]arr2=str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);

        }
    }
    public static Map<String, List<String>> anagarmaCheckwithListOfString(){
        List<List<String>> listOfString= List.of(List.of("abc","bca","tea"),
                                                 List.of("ate","cba","abc"),
                                                 List.of("edc","rte","sdc"));
        Map<String, List<String>> anagramMap = new HashMap<>();
for(List<String>innerList:listOfString){
    for (String word:innerList){
        String sortedWord = sortString(word);
       anagramMap.computeIfAbsent(sortedWord,k ->new ArrayList<>()).add(word);
    }

}        System.out.println(listOfString);
        return anagramMap;
    }
    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
