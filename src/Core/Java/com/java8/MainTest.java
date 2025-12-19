package Core.Java.com.java8;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Core Test Java 8");
        String inputString = "java is a#! programing language ";

       // System.out.println(" Words counts ...");
      //WordCountFromaGivenStringjava8.wordCountUsingStream(inputString);
      //WordCountFromaGivenStringjava8.wordCountUsingMerge();

       // System.out.println(" character counts ...");
       // CharacterCounts.characterCountsWithMergeFunction(inputString);
       // CharacterCounts.charCountUsingGroupingBy(inputString);

        System.out.println("find the number based on there position....");
        FindNumberPosition.findSecondHighestNumber();
        FindNumberPosition.nthHighestNumberAscendingOrder(1);
        FindNumberPosition.nthHighestNumberUsingDescendingOrder(4);

    }

}
