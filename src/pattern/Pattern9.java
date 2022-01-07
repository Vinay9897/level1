package pattern;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n / 2;
        int st = 1;
        int s = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print(s + "\t");
                if (j <= st / 2) {
                    s++;
                } else {
                    s--;
                }
            }
            System.out.println();

            if (i < n / 2) {
                sp -= 1;
                st += 2;
                // s++;
            } else {
                sp += 1;
                st -= 2;
                // s--;
            }
        }
    }

}
