package pattern;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int r = 0;
        int c = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == r) && (j == c)) {
                    System.out.print("*\t");
                    r++;
                    c--;
                } else if ((i == j)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

}
