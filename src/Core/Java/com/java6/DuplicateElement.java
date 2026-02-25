package Core.Java.com.java6;

import java.util.*;

/*
Find the Duplicate Elements
 */
public class DuplicateElement {

    public static void duplicateElementCheck() {
        List<String> elementList = Arrays.asList("Ram", "Syam", "Ram");
        List<String> duplicates = new ArrayList<>();

        for (String str : elementList) {
            if (elementList.indexOf(str) != elementList.lastIndexOf(str)) {
                if (!duplicates.contains(str)) {
                    duplicates.add(str);
                }
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }

    public static void duplicateElementCheckSet() {
        List<String> elementList = Arrays.asList("Ram", "Syam", "Ram");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String str : elementList) {
            if (!seen.add(str)) {
                duplicates.add(str);
            }
        }
        System.out.println("Duplicate elements in set used: "+duplicates);
    }

}




