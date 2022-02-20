package inftq;

class Solution {
    static void prank(long[] a, int n) {
        // code here
        long[] a1 = new long[a.length];
        for (int i = 0; i < n; i++) {
            a1[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i] = a1[(int) a[i]];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        long[] a = { 0, 5, 1, 2, 4, 3 };
        int n = a.length;
        prank(a, n);
    }
}