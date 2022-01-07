package pattern;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (2 * n) - 1; j++) {
                System.out.println("*\t");
            }
        }
    }

}
