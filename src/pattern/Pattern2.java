package pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int r = 5;
        int c = 7;
        int space = 1;
        int star = 3;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (i < r / 2) {
                space += 2;
                star -= 1;
            } else {
                space -= 2;
                star += 1;
            }
        }
    }

}
