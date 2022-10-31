package exception;

public class TryCathDemo {
    public static void main(String[] args) {
        int val = 10, val2 = 0;
        try {
            float div = val / val2;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }
        try {
            int num = Integer.parseInt("Vinay");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("format is not correct");
        }

    }
}
