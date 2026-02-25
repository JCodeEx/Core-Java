package Core.Java.com.java8;

import java.util.*;
import java.util.stream.Collectors;

/*
Find the Duplicate Elements
 */
public class DuplicateElement {

    public static void duplicateElementCheck() {
        List<String> elementList = Arrays.asList("Ram", "Shyam", "Ram");
        Set<String> hasSet=new HashSet<>();
        Set<String> duplicate = elementList.stream().filter(s -> !hasSet.add(s))
                .collect(Collectors.toSet());
        System.out.println("Java8 used ... " + duplicate);

    }
}


