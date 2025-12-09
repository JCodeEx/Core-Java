package Core.Java.com.java6;

public class CoreTest {
    public static void main(String[] args) {
        System.out.println("Core Test");

        WordCountFromListOfStringJava6 wordCount = new WordCountFromListOfStringJava6();
        //wordCount.wordCountFromListOfStringJava6();
        WordCountFromaGivenStringjava6 wordCountFromaGivenString = new WordCountFromaGivenStringjava6();
        //wordCountFromaGivenString.wordCountFromaGivenString();

        NumberOfWordsInAString numberOfWords = new NumberOfWordsInAString();
        String input = "  Hello   world! This is a   test string.  ";
        numberOfWords.numberOfWordsInAString(input);
        numberOfWords.java8Used();

    }
}
