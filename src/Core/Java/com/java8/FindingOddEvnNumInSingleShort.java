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
        Map<Boolean, List<Integer>> filterList = numberList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers=filterList.get(true);
        List<Integer>oddNumbers=filterList.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        /*
        * By Using GroupBy function
        * */


    }
}
