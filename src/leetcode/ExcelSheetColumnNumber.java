package leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String str = new String("ZY");
        int sum = 0;
        int digit = 0;
        int p = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            digit = c - 'A' + 1;
            sum += digit * Math.pow(26, p++);

        }
        System.out.println(sum);
    }
}