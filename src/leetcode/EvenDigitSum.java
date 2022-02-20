package leetcode;

public class EvenDigitSum {
    public static void main(String[] args) {
        int n = 4;
        // StringBuilder sb= new StringBuilder();
        int copy = 0;
        int count = 0;
        int v = 2;
        while (v <= n) {
            int sum = 0;
            copy = v;
            while (copy > 0) {
                sum += copy % 10;
                copy /= 10;
            }
            if (sum % 2 == 0 && sum <= n)
                count++;
            v++;
        }
        System.out.println(count);
    }

}
