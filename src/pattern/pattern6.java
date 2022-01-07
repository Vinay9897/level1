package pattern;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int is = -1;
        int os = 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                os -= 1;
                is += 2;
            } else {
                os += 1;
                is -= 2;
            }
            System.out.println();
        }

    }
}
