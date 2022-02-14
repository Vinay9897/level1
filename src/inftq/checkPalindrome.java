package inftq;

public class checkPalindrome {
    public static void main(String[] args) {
        String str = "she is madam";
        String[] str1 = str.split(" ");
        for (String word : str1) {
            int startIndex = 0;
            int flag = 1;
            int endIndex = word.length() - 1;
            while (startIndex < endIndex) {
                if (word.charAt(startIndex) != word.charAt(endIndex)) {
                    flag++;
                    break;
                }
                startIndex++;
                endIndex--;
            }
            if (flag == 1) {
                System.out.println(word + " is Palindrome");
            } else {
                System.out.println(word + " is Not palindrome");
            }
        }
    }
}
