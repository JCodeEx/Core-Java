package Core.Java.com.java6;

public class WordCountFromaGivenStringjava6 {
    public Void wordCountFromaGivenString() {
        String input = "apple banana apple orange banana apple";
        input = input.trim();
        String[] words = input.split("\\s");

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
