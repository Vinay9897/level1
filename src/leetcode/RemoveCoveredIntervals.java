package leetcode;

public class RemoveCoveredIntervals {
    public static void main(String[] args) {
        int[][] m = { { 1, 4 }, { 3, 6 }, { 2, 8 } };
        int len = m.length;
        int interval = 0;
        for (int i = 0; i < len - 1; i++) {
            // for (int j = 0; j < len; j++) {
            if (m[i + 1][0] <= m[i][0])
                interval++;
            if (m[i + 1][1] >= m[i][1])
                interval++;
            // }
        }
        System.out.println(interval);
    }
}
