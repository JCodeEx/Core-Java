package Core.Java.com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingOddEvnNumInSingleShort {
    public static void main(String[] args) {
        List<Integer>numberList= Arrays.asList(10, 15, 20, 25, 30, 33, 40);
       // List<Integer> enveList = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //System.out.println(enveList);
/*
* partitioningBy splits data into two groups based on a boolean condition
true → even , false → odd
* */
        Map<Boolean, List<Integer>> filterMap= numberList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers=filterMap.get(true);
        List<Integer>oddNumbers=filterMap.get(false);

        System.out.println("From Partitioning Even numbers: " + evenNumbers);
        System.out.println("From Partitioning Odd numbers: " + oddNumbers);

        /*
        * By Using GroupBy function
        * */

Map<Boolean,List<Integer>> filterMap2=numberList.stream()
        .collect(Collectors.groupingBy(n -> n%2==0));

        List<Integer>l1=filterMap2.get(true);
        List<Integer>l2=filterMap2.get(false);
        System.out.println("From GroupBy Even numbers:"+l1);
        System.out.println("From GroupBy Odd numbers:"+l2);

        Map<String, List<Integer>> map =
                numberList.stream()
                     .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));

        System.out.println("From GroupBy and ternary operator  Even numbers: " + map.get("Even"));
        System.out.println("From GroupBy and ternary operator Odd numbers: " + map.get("Odd"));
    }
}
