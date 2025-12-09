package Core.Java.com.java6;

public class WordCountFromListOfStringJava6 {
    public Void wordCountFromListOfStringJava6() {
        java.util.List<String> words = new java.util.ArrayList<String>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");

        java.util.Map<String, Integer> wordCountMap = new java.util.HashMap<String, Integer>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        for (java.util.Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return null;
    }
}
