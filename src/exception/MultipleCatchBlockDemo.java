package exception;

public class MultipleCatchBlockDemo {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("Vinay");
            System.out.println(num);
            int val = 10, val2 = 0;
            float div = val / val2;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (Exception e) {
            System.out.println("Number format exception");
        }
        System.out.println("Handled");
    }

}
