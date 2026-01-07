package Core.Java.com.java8;

import java.util.*;

public class FindFirstToNthPositionNumber {
    public static int findSecondHighestNumber(){
        List<Integer> numbers = Arrays.asList(900,200,400,600,300,900);
        int _2ndHighest= numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2).findFirst().get() ;
        System.out.println(_2ndHighest);
        return numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }
    /*

    It calculates how many unique (distinct) numbers are in the list.
    .sorted() → ascending → n-th smallest
    .sorted(reverseOrder()) → descending → n-th highest

    reverseOrder() is used so the highest values come first,
    allowing us to directly skip n-1 elements to get the n-th highest.
     Without it,default ascending order gives the n-th smallest instead.
     */
// Using ascending order correctly
   public static void nthHighestNumberAscendingOrder(int n){
       List<Integer> numbers = Arrays.asList(900,200,400,600,300,900);
       int distinctNumber = (int) numbers.stream().distinct().count();
       System.out.println("distinct applied ..."+distinctNumber);
    int nthHighest=numbers.stream()
               .distinct().sorted().skip(distinctNumber- n).findFirst()
               .orElseThrow();
       System.out.println(nthHighest);
   }
    // Using descending order correctly
    public static void nthHighestNumberUsingDescendingOrder(int n){
        List<Integer> numbers = Arrays.asList(900,200,400,600,300,900);
        //int n=2;
        int nthHighest=numbers.stream().distinct().sorted(Collections.reverseOrder())
                .skip(n-1).findFirst().orElseThrow();
        System.out.println(nthHighest);
    }

}
