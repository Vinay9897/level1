package leetcode;

public class CountWordsWithAGivenPrefix {
    public static void main(String[] args) {
        String[] words = { "pay", "attention", "practice", "attend" };
        String prefix = "at";
        for (String word : words) {
            int count = 0;
            int start = 0;
            int end = 2;
            while (start < end) {
                if (word.charAt(start) == prefix.charAt(start)) {

                    count++;
                }
                start++;
            }
            System.out.println("count " + count);
        }
    }
}