package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String str = "my name is vinay";
        // String[] s = str.split(" ");
        // for (int i = 0; i < s.length; i++)
        // s[i] = new StringBuilder(s[i]).reverse().toString();

        // StringBuilder sb = new StringBuilder();
        // for (String st : s) {
        // sb.append(st + " ");
        // }
        // System.out.println(sb.toString().trim());
        char[] s = str.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                reverse(s, j, i - 1);
                j = i + 1;
            }
        }
        reverse(s, j, s.length - 1);
        String s1 = new String(s);
        System.out.println(s1);
    }

    private static void reverse(char[] s, int j, int i) {
        while (j < i) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
            i--;
        }
    }
}