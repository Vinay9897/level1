package pattern;

public class pattern1 {
    public static void main(String[] args) {

        int n = 5;
        int space = n / 2;
        int star = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i < (n / 2)) {
                space--;
                star += 2;
            } else {
                space += 1;
                star -= 2;
            }
        }
    }
}
